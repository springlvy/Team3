package com.jnu.teamproject.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetPythonData {
	public static String[] getElecCost(String room) throws IOException{
		String[] elecCost=new String[6];
		File directory = new File(".");
		String exeFileName=directory.getCanonicalPath()+"\\libs\\getele.exe";
		String[] cmd = {exeFileName,room};
		//执行exe文件
		final Process proc = Runtime.getRuntime().exec(cmd);

		//读取exe文件在exe控制台的输出结果
		BufferedReader stdout = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		stdout.readLine();//读取一行
		elecCost[0] = stdout.readLine();//读取一行
		System.out.println(elecCost[0]);
		
		stdout.readLine();
		stdout.readLine();
		stdout.readLine();
		stdout.readLine();
		
		
		elecCost[1] = stdout.readLine();//读取一行
		elecCost[2] = stdout.readLine();//读取一行
		elecCost[3] = stdout.readLine();//读取一行
		elecCost[4] = stdout.readLine();//读取一行
		elecCost[5] = stdout.readLine();//读取一行
		
		System.out.println(elecCost[0].substring(8, 13));
		return elecCost;
	}
	
	public static String[] getSchoolCardInfo(String number,String password) throws IOException{
		String[] InfoString=new String[2];
		File directory = new File(".");
		String exeFileName=directory.getCanonicalPath()+"\\libs\\getcardinf\\getcardinf";

		//执行exe文件
		final Process proc = Runtime.getRuntime().exec("cmd /c cd "+exeFileName+"&getcardinf.exe "+number+" "+password);
		//读取exe文件在exe控制台的输出结果
		BufferedReader stdout = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		
		InfoString[0] = stdout.readLine();//读取一行
		InfoString[1]=stdout.readLine();
		return InfoString;
	}
}
