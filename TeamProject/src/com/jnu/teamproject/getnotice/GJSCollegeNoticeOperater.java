//GuoJiShangCollegeNoticeOperater
package com.jnu.teamproject.getnotice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.jnu.teamproject.data.UserInfo;


public class GJSCollegeNoticeOperater {
	private Logger log = Logger.getLogger(UserInfo.class); 
	
	public GJSCollegeNoticeOperater() throws Exception,FileNotFoundException,IOException {
	//public static void main(String[] args)throws Exception,FileNotFoundException,IOException {

			//PropertyConfigurator.configure("log4j.properties");

			String url="https://gjsxy.jnu.edu.cn/tzgg/list.htm";
			String pageurl="https://gjsxy.jnu.edu.cn/tzgg/list";
			String dataurl="https://gjsxy.jnu.edu.cn";
			String collegnoticepath="./gjs.dat";
			ArrayList<SchoolNotice> noticeList=new ArrayList<SchoolNotice>();
			NoticeSerializeOperater noticeoperater=new NoticeSerializeOperater<SchoolNotice>();
			Document document = Jsoup.connect(url).get();

			Elements PageCountElement=document.getElementsByAttributeValue("class","all_pages");
			int PageCount=Integer.valueOf(PageCountElement.text()).intValue();
			//System.out.println(PageCount);
			
			//for(int i=1;i<=2;i++) {
			for(int i=1;i<=PageCount;i++) {
				String noticeurl=null;
				noticeurl=pageurl+i+".htm";
				//log.info(noticeurl);
				Document pageDocument = Jsoup.connect(noticeurl).get();
				
	            Elements elements=pageDocument.getElementsByAttributeValue("class", "common-list");
	            Elements element=elements.get(0).getElementsByTag("li");
	            for(int pageNoticesize=0;pageNoticesize<element.size();pageNoticesize++) {
	            	Elements element1=element.get(pageNoticesize).getElementsByTag("a");
					Elements element2=element.get(pageNoticesize).getElementsByTag("span");
					Elements element3=element.get(pageNoticesize).getElementsByTag("a");
					String title=null;
					String time=null;
					String collegeurl=null;
					String source="国际商学院通知";
					SchoolNotice notice=new SchoolNotice();
					if(element3.text().length()!=0) {
						if(element3.get(0).attr("href").charAt(0)=='/') {
							collegeurl=dataurl+element3.get(0).attr("href");
							//System.out.println(collegeurl);
							notice.setUrl(collegeurl);
						}
					}
					if(element1.text().length()!=0) {
						title=element1.get(0).text();
						//System.out.println(title);
						notice.setTitle(title);
					}
					if(element2.text().length()!=0) {
						time=element2.text();
						notice.setTime(time);
					}
					notice.setSource(source);
	
					if(element1.text().length()!=0) {
						//System.out.println(notice.getContent());
						noticeList.add(notice);
					}
				}
			}
			noticeoperater.save(noticeList, collegnoticepath);
			ArrayList<SchoolNotice> Desnotices=noticeoperater.load(collegnoticepath);
		}
}

