package com.jnu.teamproject.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.jnu.teamproject.data.UserInfo;

public class Serialization {

    private static String file="data.dat";
    public static UserInfo read(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            fis=new FileInputStream(file);
            ois=new ObjectInputStream(fis);
            return (UserInfo)ois.readObject();
        }catch(FileNotFoundException e){
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch ( Exception e ) {
            }
            try {
                fis.close();
            } catch ( Exception e ) {
            }
        }
        return null;
    }

    public static boolean write(Serializable ser){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ser);
            oos.flush();
            return true;
        } catch ( Exception e ) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                oos.close();
            } catch ( Exception e ) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }
    }
}
