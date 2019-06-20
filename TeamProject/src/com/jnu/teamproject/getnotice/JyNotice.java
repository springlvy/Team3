package com.jnu.teamproject.getnotice;

import java.io.IOException;
import java.io.Serializable;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JyNotice implements Serializable {
	public String title;
	public String time;
	public String source;
	public String url;
	public String content;
	

	JyNotice(String noticeurl)throws IOException{

		String result="";
		String result2="";
		String result3="";
		Document document=Jsoup.connect(noticeurl).get();
		Elements elements=document.getElementsByAttributeValue("class", "con_main_1");
		Elements element1=elements.get(0).getElementsByTag("p");
		Elements element2=elements.get(0).getElementsByTag("div");
		for(int pageNoticesize=1;pageNoticesize<element1.size();pageNoticesize++) {
			result2+=element1.get(pageNoticesize).text()+"\r\n";
		}
		for(int pageNoticesize=1;pageNoticesize<element2.size();pageNoticesize++) {
			result2+=element2.get(pageNoticesize).text()+"\r\n";
		}
		if(result2.length()>result3.length())
			result=result2;
		else
			result=result3;
		content=result;
		//System.out.println(result);

	}
	
	



	public JyNotice() {

	}





	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
