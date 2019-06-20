package com.jnu.teamproject.getnotice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.jnu.teamproject.data.UserInfo;


public class SchoolNoticeOperater {
	private Logger log = Logger.getLogger(UserInfo.class);  
	//NoticeOperater(Elements element){
	public static void main(String[] args) throws Exception,FileNotFoundException,IOException{
	//public SchoolNoticeOperater() throws Exception,FileNotFoundException,IOException {

		//PropertyConfigurator.configure("log4j.properties");
		
		String noticeurl1="https://www.jnu.edu.cn/tz";
		String noticeurl2="https://xsc.jnu.edu.cn";
		String url="https://www.jnu.edu.cn/tz/list.psp";
		String shoolnoticepath="./schoolnotice.dat";
		ArrayList<SchoolNotice> noticeList=new ArrayList<SchoolNotice>();
		NoticeSerializeOperater noticeoperater=new NoticeSerializeOperater<SchoolNotice>();
		Document document = Jsoup.connect(url).get();
		
		Elements PageCountElement=document.getElementsByClass("all_pages");
		int PageCount=Integer.valueOf(PageCountElement.text()).intValue();
		
		//for(int i=1;i<=1;i++) {
		for(int i=1;i<=PageCount;i++) {
			String noticeurl=noticeurl1+"/list"+i+".psp";
			//log.info(noticeurl);
			System.out.println(noticeurl);
			Document pageDocument = Jsoup.connect(noticeurl).get();
            Elements elements=pageDocument.select("tr");
            for(int pageNoticesize=1;pageNoticesize<elements.size();pageNoticesize++) {
            	Elements element1=elements.get(pageNoticesize).getElementsByTag("a");
				Elements element2=elements.get(pageNoticesize).getElementsByClass("time");
				String title=element1.get(0).text();
				String source=element1.get(1).text();
				String urlnotice=null;
				String time=element2.get(0).text();
				if(element1.get(0).attr("href").charAt(1)=='_') {
					urlnotice=noticeurl2+element1.get(0).attr("href");
					//System.out.println(1+urlnotice);
				}
				else if(element1.get(0).attr("href").charAt(0)=='h') {
					urlnotice=element1.get(0).attr("href");
					//System.out.println(2+urlnotice);
				}
				else {
					urlnotice=noticeurl1+element1.get(0).attr("href");
					//System.out.println(3+urlnotice);
				}
				//SchoolNotice notice=new SchoolNotice(urlnotice);
				SchoolNotice notice=new SchoolNotice();
				if(notice.getContent()!="") {
					notice.setTitle(title);
					notice.setTime(time);
					notice.setUrl(urlnotice);
					notice.setSource(source);
					noticeList.add(notice);
				}
			}	
			} 
		noticeoperater.save(noticeList, shoolnoticepath);
		ArrayList<SchoolNotice> Desnotices=noticeoperater.load(shoolnoticepath);
		}
}
	
