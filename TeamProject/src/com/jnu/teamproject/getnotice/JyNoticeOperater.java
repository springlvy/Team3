package com.jnu.teamproject.getnotice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.jnu.teamproject.data.UserInfo;

public class JyNoticeOperater {
	private Logger log = Logger.getLogger(UserInfo.class); 
	//JyNoticeOperater(Elements element){
	
	public JyNoticeOperater() throws Exception,FileNotFoundException,IOException {
				PropertyConfigurator.configure("log4j.properties");
		
				String url="http://zhxgb.jnu.edu.cn/employment/info/";
				String pageurl="http://zhxgb.jnu.edu.cn/employment/info/index_";
				String dataurl="http://zhxgb.jnu.edu.cn";
				String Jynoticepath="./Jynotice.dat";
				ArrayList<JyNotice> noticeList=new ArrayList<JyNotice>();
				NoticeSerializeOperater noticeoperater=new NoticeSerializeOperater<JyNotice>();
				Document document = Jsoup.connect(url).get();
				//System.out.println(document.text());
				Elements PageCountElement=document.getElementsByAttributeValue("class", "list_g_1");
				int PageCount=Integer.valueOf(PageCountElement.text().substring(5, 7)).intValue();
				//System.out.println(PageCount);
				for(int i=1;i<=PageCount;i++){
					String noticeurl=null;
					if(i==1)
						noticeurl=url;
					else 
						noticeurl=pageurl+i+".html";
					//System.out.println(noticeurl);
					log.info(noticeurl);
					Document pageDocument = Jsoup.connect(noticeurl).get();
		            Elements elementslist=pageDocument.select("div");
		            Elements elements=elementslist.get(10).getElementsByTag("li");
		            for(int pageNoticesize=28;pageNoticesize<elements.size()-8;pageNoticesize++) {
		            	Elements element1=elements.get(pageNoticesize).getElementsByTag("a");
						Elements element2=elements.get(pageNoticesize).getElementsByClass("list_date_1");
						Elements element3=elements.get(pageNoticesize).getElementsByTag("a");
						String title=null;
						String time=null;
						String collegeurl=null;
						String source="就业通知";
						JyNotice notice=new JyNotice();
						if(element3.text().length()!=0) {
							collegeurl=dataurl+element3.get(0).attr("href");
							notice=new JyNotice(collegeurl);
							notice.setUrl(collegeurl);
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
							noticeList.add(notice);
						}
					}
				}
				noticeoperater.save(noticeList, Jynoticepath);
				ArrayList<JwcNotice> Desnotices=noticeoperater.load(Jynoticepath);
			
			}
	}

