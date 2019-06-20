package com.jnu.teamproject.getnotice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class NoticeSerializeOperater<T> {
	private  static  final  long serialVersionUID = 1L ;
	public  void save(ArrayList<T> notices,String path) throws FileNotFoundException,IOException { 
	        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
	                  new File(path)));
	          oo.writeObject(notices);
	          oo.close();
	   }
	      /**
	       * MethodName: DeserializePerson 
	       */
	public  ArrayList<T> load(String path) throws Exception, IOException {
	    	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
	                  new File(path)));
	    	  ArrayList<T> notices = (ArrayList<T>) ois.readObject();
	          return notices;
	      }
	
}

