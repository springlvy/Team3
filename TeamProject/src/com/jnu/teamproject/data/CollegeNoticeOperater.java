package com.jnu.teamproject.data;

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

import com.jnu.teamproject.getnotice.NoticeSerializeOperater;





public class CollegeNoticeOperater {
	private Logger log = Logger.getLogger(UserInfo.class); 
	//NoticeOperater(Elements element){
	public CollegeNoticeOperater() throws Exception,FileNotFoundException,IOException {
			//配置日记文件
			PropertyConfigurator.configure("log4j.properties");
		
			String url="https://rwxy.jnu.edu.cn/11063/list.htm";
			String pageurl="https://rwxy.jnu.edu.cn/11063/list";
			String dataurl="https://rwxy.jnu.edu.cn";
			String collegnoticepath="./src/com/jnu/groupproject/data/collegenotice.dat";
			ArrayList<CollegeNotice> noticeList=new ArrayList<CollegeNotice>();
			NoticeSerializeOperater noticeoperater=new NoticeSerializeOperater<CollegeNotice>();
			Document document = Jsoup.connect(url).get();
			
			//获取�?大页�?
			Elements PageCountElement=document.getElementsByAttributeValue("class","all_pages");
			int PageCount=Integer.valueOf(PageCountElement.text()).intValue();

			
			//爬取数据并序列化与反序列�?
			//for(int i=1;i<=1;i++) {
			for(int i=1;i<=PageCount;i++) {
				String noticeurl=null;
				noticeurl=pageurl+i+".htm";
				//System.out.println(noticeurl);
				log.info(noticeurl);
				Document pageDocument = Jsoup.connect(noticeurl).get();
				
	            Elements elements=pageDocument.getElementsByAttributeValue("class", "news_list list2");
	            Elements element=elements.get(0).getElementsByTag("li");
	            for(int pageNoticesize=0;pageNoticesize<element.size();pageNoticesize++) {
	            	Elements element1=element.get(pageNoticesize).getElementsByTag("a");//标题
					Elements element2=element.get(pageNoticesize).getElementsByClass("news_meta");//日期
					Elements element3=element.get(pageNoticesize).getElementsByTag("a");//链接
					String title=null;
					String time=null;
					String collegeurl=null;
					String source="学院通知";
					CollegeNotice notice=new CollegeNotice();
					if(element3.text().length()!=0) {
						if(element3.get(0).attr("href").charAt(0)=='/') {
							collegeurl=dataurl+element3.get(0).attr("href");
							//System.out.println(collegeurl);
							notice.setUrl(collegeurl);
						}
					}
					if(element1.text().length()!=0) {
						title=element1.get(0).attr("title");//标题
						notice.setTitle(title);
					}
					if(element2.text().length()!=0) {
						time=element2.text();//时间
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
			ArrayList<CollegeNotice> Desnotices=noticeoperater.load(collegnoticepath);
			log.info("成功爬取学院通知"+Desnotices.size());
		}
}
