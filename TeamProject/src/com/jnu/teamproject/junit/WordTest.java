package com.jnu.teamproject.junit;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class WordTest {
	@Test
	public void test(){
        Map<String,Object> dataMap = new HashMap<String, Object>();
        try {
            //编号
            dataMap.put("reason", "生病了，看医生");
            //日期
            dataMap.put("Fyear", "2019");
            //附件张数
            dataMap.put("Fmonth", "5");
            //受款人
            dataMap.put("Fday", "3");
            //付款用途
            dataMap.put("Tyear", "2019");
            //大写金额
            dataMap.put("Tmonth", "5");
            //小写金额
            dataMap.put("Tday", "4");
            dataMap.put("day", "1");
            //Configuration 用于读取ftl文件
            Configuration configuration = new Configuration(new Version("2.3.0"));
            configuration.setDefaultEncoding("utf-8");
 
            /**
             * 以下是两种指定ftl文件所在目录路径的方式，注意这两种方式都是
             * 指定ftl文件所在目录的路径，而不是ftl文件的路径
             */
            //指定路径的第一种方式（根据某个类的相对路径指定）
            configuration.setClassForTemplateLoading(this.getClass(), "doc");
 
            //指定路径的第二种方式，我的路径是C：/a.ftl
            //configuration.setDirectoryForTemplateLoading(new File("c:/"));
 
            //输出文档的绝对路径及名称
            //File outFile = new File("E:/暨南大学学生请假申请表.doc");
            
            //工程的相对路径输出
            File outFile = new File("./暨南大学学生请假申请表.doc");
            //以utf-8的编码读取ftl文件
            Template template = configuration.getTemplate("暨南大学学生请假申请表.ftl", "utf-8");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
