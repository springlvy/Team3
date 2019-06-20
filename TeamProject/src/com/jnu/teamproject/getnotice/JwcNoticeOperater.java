package com.jnu.teamproject.getnotice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.jnu.teamproject.data.UserInfo;


public class JwcNoticeOperater {
	//private Logger log = Logger.getLogger(UserInfo.class); 
	//NoticeOperater(Elements element){
	//public static void main(String[] args) throws Exception {
	public JwcNoticeOperater() throws Exception,FileNotFoundException,IOException {
		//PropertyConfigurator.configure("log4j.properties");
		
		String url="https://zhjw.jnu.edu.cn/7099/list.htm";
		String pageurl="https://zhjw.jnu.edu.cn/7099/list";
		String dataurl="https://zhjw.jnu.edu.cn";
		String Jwcnoticepath="./jwc.dat";
		ArrayList<SchoolNotice> noticeList=new ArrayList<SchoolNotice>();
		NoticeSerializeOperater noticeoperater=new NoticeSerializeOperater<JwcNotice>();
		Document document = Jsoup.connect(url).get();
				
		Elements PageCountElement=document.getElementsByClass("all_pages");
		int PageCount=Integer.valueOf(PageCountElement.text()).intValue();
		//System.out.println(PageCount);
		//for(int i=1;i<=1;i++) {
		for(int i=1;i<=PageCount;i++) {
			String noticeurl=pageurl+i+".htm";
			//System.out.println(noticeurl);
			//log.info(noticeurl);
			Document pageDocument = Jsoup.connect(noticeurl).get();
		    Elements elements=pageDocument.select("li");
		    for(int pageNoticesize=0;pageNoticesize<elements.size();pageNoticesize++) {
		        Elements element1=elements.get(pageNoticesize).getElementsByClass("inf list-inf");
				Elements element2=elements.get(pageNoticesize).getElementsByClass("s_time");
				Elements element3=elements.get(pageNoticesize).getElementsByClass("inf list-inf");
				String title=null;
				String time=null;
				String Jwcurl=null;
				String source="教务处通知";
				SchoolNotice notice=new SchoolNotice();
				if(element3.text().length()!=0) {
					if(element3.get(0).attr("href").charAt(0)=='/')
						Jwcurl=dataurl+element3.get(0).attr("href");
					else
						Jwcurl=element3.get(0).attr("href");
					//System.out.println(Jwcurl);
					if(Jwcurl.equals("https://zhjw.jnu.edu.cn/80/ed/c7162a164077/page.htm"))
						continue;
					//notice=new JwcNotice(Jwcurl);
					notice.setUrl(Jwcurl);
				}
				if(element1.text().length()!=0) {
					title=element1.text();
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
		noticeoperater.save(noticeList, Jwcnoticepath);
		ArrayList<SchoolNotice> Desnotices=noticeoperater.load(Jwcnoticepath);

	}
}
