package com.jnu.teamproject.data;

import java.io.File;

import java.io.FileInputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

import org.apache.log4j.Logger;

public class PrintFile {
	
	static Logger logger = Logger.getLogger(PrintFile.class);
	
	public static void main(String args[]) {
		printFileAction();
	}
	
	public static void printFileAction() 
	{ 
		File outFile = new File("./暨南大学学生请假申请表.doc");
	     // 构建打印请求属性集
	    PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet(); 
	     // 设置打印格式，因为未确定文件类型，这里选择 AUTOSENSE 
	    DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE; 
	     // 查找所有的可用打印服务
	    PrintService printService[] = 
	        PrintServiceLookup.lookupPrintServices(flavor, pras);
	     // 定位默认的打印服务
	    PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
	    // 显示打印对话框
	    PrintService service = ServiceUI.printDialog(null, 200, 200, printService 
	        , defaultService, flavor, pras); 
	    if (service != null) 
	    { 
	         try 
	        { 
	            DocPrintJob job = service.createPrintJob();// 创建打印作业
	            FileInputStream fis = new FileInputStream(outFile);// 构造待打印的文件流
	            DocAttributeSet das = new HashDocAttributeSet(); 
	            Doc doc = new SimpleDoc(fis, flavor, das);// 建立打印文件格式
	            job.print(doc, pras);// 进行文件的打印
	        } 
	        catch(Exception e) 
	        { 
	             //e.printStackTrace(); 
	             logger.error(e.getMessage());
	        } 
	    } 
	}
}
