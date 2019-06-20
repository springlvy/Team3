package com.jnu.teamproject.data;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.jnu.teamproject.getnotice.CollegeNoticeOperater;
import com.jnu.teamproject.getnotice.FYCollegeNoticeOperater;
import com.jnu.teamproject.getnotice.GJSCollegeNoticeOperater;
import com.jnu.teamproject.getnotice.JwcNoticeOperater;
import com.jnu.teamproject.getnotice.RWCollegeNoticeOperater;
import com.jnu.teamproject.getnotice.SchoolNoticeOperater;

public class UpdateThread extends Thread{
	public void run() {
		try {
			new CollegeNoticeOperater();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			new FYCollegeNoticeOperater();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			new GJSCollegeNoticeOperater();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			new RWCollegeNoticeOperater();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			new JwcNoticeOperater();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			new SchoolNoticeOperater();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
