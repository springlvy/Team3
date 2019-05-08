package com.jnu.teamproject.data;
import java.awt.FileDialog;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class FileOpen {

    private Frame jf;
    private PrintStream jtext;

    public static void main(String[] args) throws Exception {
        FileOpen hj = new FileOpen();
        //hj.open();
        hj.save();

    }

    public void save() throws Exception{

        FileDialog fd = new FileDialog(jf, "另存为", FileDialog.SAVE);

        fd.setVisible(true);
        
        String path=fd.getDirectory() + fd.getFile()+".doc";
        
        Map<String,Object> dataMap = new HashMap<String, Object>();
        try {
            dataMap.put("reason", "生病了，看医生");
            dataMap.put("Fyear", "2019");
            dataMap.put("Fmonth", "5");
            dataMap.put("Fday", "3");
            dataMap.put("Tyear", "2019");
            dataMap.put("Tmonth", "5");
            dataMap.put("Tday", "4");
            dataMap.put("day", "1");
            Configuration configuration = new Configuration(new Version("2.3.0"));
            configuration.setDefaultEncoding("utf-8");
 
            configuration.setClassForTemplateLoading(this.getClass(), "doc");
 
            File outFile = new File(path);

            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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