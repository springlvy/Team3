package com.jnu.teamproject.junit;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
 
import java.io.IOException;
import java.io.InputStream;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;

public class Word2PdfTest {
	
	public static void main(String[] args) {
       doc2pdf("E:\\暨南大学学生请假申请表.doc","E:\\暨南大学学生请假申请表.pdf");
	}
	private static boolean getLicense() {
        boolean result = false;
        try {
            // 凭证
            String licenseStr =
                    "<License>\n"
                    + " <Data>\n"
                    + " <Products>\n"
                    + " <Product>Aspose.Total for Java</Product>\n"
                    + " <Product>Aspose.Words for Java</Product>\n"
                    + " </Products>\n"
                    + " <EditionType>Enterprise</EditionType>\n"
                    + " <SubscriptionExpiry>20991231</SubscriptionExpiry>\n"
                    + " <LicenseExpiry>20991231</LicenseExpiry>\n"
                    + " <SerialNumber>8bfe198c-7f0c-4ef8-8ff0-acc3237bf0d7</SerialNumber>\n"
                    + " </Data>\n"
                    + " <Signature>sNLLKGMUdF0r8O1kKilWAGdgfs2BvJb/2Xp8p5iuDVfZXmhppo+d0Ran1P9TKdjV4ABwAgKXxJ3jcQTqE/2IRfqwnPf8itN8aFZlV3TJPYeD3yWE7IT55Gz6EijUpC7aKeoohTb4w2fpox58wWoF3SNp6sK6jDfiAUGEHYJ9pjU=</Signature>\n"
                    + "</License>";
            InputStream license = new ByteArrayInputStream(
                    licenseStr.getBytes("UTF-8"));
            License asposeLic = new License();
            asposeLic.setLicense(license);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	 
	public static void doc2pdf(String inPath, String outPath) {
    	FileOutputStream os =null;
    	if(!getLicense())
    		return;
        try {
            File file = new File(outPath); // 新建一个空白pdf文档
            os = new FileOutputStream(file);
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	if(os!=null){
        		try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
    }
}