package com.jnu.teamproject.data;
import java.awt.FileDialog;


import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.jnu.teamproject.junit.Word2Pdf;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class SaveAs {
	
	Logger logger = Logger.getLogger(SaveAs.class);
	
    private static Frame jf;
    private PrintStream jtext;

    public static void save_As_Word(String str[]) throws Exception{

        FileDialog fd = new FileDialog(jf, "另存为", FileDialog.SAVE);

        fd.setVisible(true);
        
        String path=fd.getDirectory() + fd.getFile()+".doc";
        
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
 
            //configuration.setClassForTemplateLoading(SaveAs.class, "");
            String path_ftl = System.getProperty("user.dir")+"./documents";
            configuration.setDirectoryForTemplateLoading(new File(path_ftl));
 
            File outFile = new File(path);

            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void save_As_PDF(String str[]) throws Exception{

        FileDialog fd = new FileDialog(jf, "另存为", FileDialog.SAVE);

        fd.setVisible(true);
        
        String path=fd.getDirectory() + fd.getFile();
        
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
 
            //configuration.setClassForTemplateLoading(SaveAs.class, "");
            String path_ftl = System.getProperty("user.dir")+"./documents";
            configuration.setDirectoryForTemplateLoading(new File(path_ftl));
 
            File outFile = new File(path+".doc");

            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Word2Pdf.doc2pdf(path+".doc",path+".pdf");
    }

    public void open() throws Exception {
        FileDialog fdopen = new FileDialog(jf, "打开", FileDialog.LOAD);

        fdopen.setVisible(true);

        BufferedReader in = new BufferedReader(new FileReader(fdopen.getDirectory() + fdopen.getFile()));

        String str = null;

        while((str = in.readLine()) != null) {
            System.out.println(str);

            jtext.append(str + "\n");
        }
        in.close();
    }
}