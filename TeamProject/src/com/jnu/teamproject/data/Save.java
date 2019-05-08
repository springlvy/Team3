package com.jnu.teamproject.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class Save {

	static Logger logger = Logger.getLogger(Save.class);
	
	public static void saveWord(String str[]){
        Map<String,Object> dataMap = new HashMap<String, Object>();
        try {
        	dataMap.put("reason", str[0]);

            dataMap.put("Fyear", str[1]);

            dataMap.put("Fmonth",str[2]);

            dataMap.put("Fday", str[3]);

            dataMap.put("Tyear", str[4]);

            dataMap.put("Tmonth", str[5]);

            dataMap.put("Tday", str[6]);
            
            int day=Integer.valueOf(str[6])-Integer.valueOf(str[3]);
            dataMap.put("day", String.valueOf(day));
            //Configuration 用于读取ftl文件
            Configuration configuration = new Configuration(new Version("2.3.0"));
            configuration.setDefaultEncoding("utf-8");
 
            //指定路径的第一种方式（根据某个类的相对路径指定）
            //configuration.setClassForTemplateLoading(Save.class, "");
 
            //指定路径的第二种方式，我的路径是C：/a.ftl
            String path = System.getProperty("user.dir")+"./documents";
            configuration.setDirectoryForTemplateLoading(new File(path));
            
            //工程的相对路径输出
            File outFile = new File("./暨南大学学生请假申请表.doc");
            //以utf-8的编码读取ftl文件
            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
	}
	
	public static void savePDF(String str[]){
        Map<String,Object> dataMap = new HashMap<String, Object>();
        try {

            dataMap.put("reason", str[0]);

            dataMap.put("Fyear", str[1]);

            dataMap.put("Fmonth",str[2]);

            dataMap.put("Fday", str[3]);

            dataMap.put("Tyear", str[4]);

            dataMap.put("Tmonth", str[5]);

            dataMap.put("Tday", str[6]);
            
            int day=Integer.valueOf(str[6])-Integer.valueOf(str[3]);
            dataMap.put("day", String.valueOf(day));
            
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
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        Word2Pdf.doc2pdf("./暨南大学学生请假申请表.doc", "./暨南大学学生请假申请表.pdf");
	}
}
