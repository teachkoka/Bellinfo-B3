package com.bellinfo.batch3.corejava.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationEx {

	public static void main(String[] args) {
		String fileName = "website.txt";
		String absPath = System.getProperty("user.dir");
		String fullPath = absPath+File.separator+fileName;
		
		WebSite w1 = new WebSite();
		
		try(FileInputStream fis = new FileInputStream(fullPath);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			    w1 =(WebSite)ois.readObject();
			    System.out.println(w1.getRank());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
