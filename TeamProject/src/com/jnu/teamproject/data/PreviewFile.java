package com.jnu.teamproject.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class PreviewFile {
	
	static Logger logger = Logger.getLogger(PreviewFile.class);
	
	public static void previewFile(String str[]) throws IOException{
        Map<String,Object> dataMap = new HashMap<String, Object>();
        
        UserInfo user=new UserInfo();
		user=Serialization.read();
		
        try {
        	dataMap.put("Number", user.getNumber());
        	
        	dataMap.put("Name", user.getName());
        	
        	dataMap.put("Major", user.getMajor());
        	
        	dataMap.put("Institution", user.getInstitution());
        	
        	dataMap.put("Reason", str[0]);

            dataMap.put("Fyear", str[1]);

            dataMap.put("Fmonth",str[2]);

            dataMap.put("Fday", str[3]);

            dataMap.put("Tyear", str[4]);

            dataMap.put("Tmonth", str[5]);

            dataMap.put("Tday", str[6]);
            
            int day=DaysOfTwo.daysOfTwo(str);
            dataMap.put("Day", String.valueOf(day));
            
            Configuration configuration = new Configuration(new Version("2.3.0"));
            configuration.setDefaultEncoding("utf-8");
 
            String path = System.getProperty("user.dir")+"./documents";
            configuration.setDirectoryForTemplateLoading(new File(path));
            
            File outFile = new File("./暨南大学学生请假申请表.doc");
            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
            
        } catch (Exception e) {
            //e.printStackTrace();
            logger.error(e.getMessage());
        }
        
        Word2Pdf.doc2pdf("./暨南大学学生请假申请表.doc", "./暨南大学学生请假申请表.pdf");
        
        File file = new File("./暨南大学学生请假申请表.pdf");
        logger.info(file.getAbsolutePath());
        
        Runtime ce=Runtime.getRuntime();
        if(ce.exec("cmd /c start "+file.getAbsolutePath())==null)
        	logger.error("调用浏览器预览失败");
        logger.info("调用浏览器预览成功");
	}
 
	
}
