package com.bellinfo.batch3.corejava.day11;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.Pack200;

public class FileCreation {

	public static void main(String[] args) {

		// 1 way of creating a file
		File simpleFile = new File(
				"C:\\Users\\kaizen\\workspace\\Bellinfo-B3\\bellinfo.txt");
		try {
			simpleFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(simpleFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);) {

			// 2nd way of creating a file
			String fileName = "capitalone.txt";
			String path = System.getProperty("user.dir");
			String absolutePath = path + File.separator + fileName;

			File capitalFile = new File(absolutePath);
			capitalFile.createNewFile();

			// Reading a file through input Stream

			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}

			/*dis.close();
			bis.close();
			fis.close();*/

			// Reading a file through BufferedReader

			FileReader fr = new FileReader(capitalFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException oie) {

		}

	}

}
