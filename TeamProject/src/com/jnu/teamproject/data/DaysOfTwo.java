package com.jnu.teamproject.data;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class DaysOfTwo {

	static Logger logger = Logger.getLogger(DaysOfTwo.class);
	
	public static int daysOfTwo(String str[]) throws ParseException {
		
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String from=str[1]+"-"+str[2]+"-"+str[3];
        String to=str[4]+"-"+str[5]+"-"+str[6];
        Date fDate=sdf.parse(from);
        Date oDate=sdf.parse(to);
        long days=(oDate.getTime()-fDate.getTime())/(1000*3600*24);
       
        return (int)days;  
    }
}
