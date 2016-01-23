package com.bellinfo.batch3.corejava.day11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileExample2 {

	public static void main(String[] args) {

		try {
			String additionalText = "This information goes to cap file";
			String fileName = "cap.txt";
			String path = System.getProperty("user.dir");
			String absolutePath = path + File.separator + fileName;

			File capFile = new File(absolutePath);

			if (!capFile.exists()) {
				capFile.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(capFile,true);
		    //TODO Appending data in to existing file
			fos.write(additionalText.getBytes());
			fos.flush();
			fos.close();
			
			//Another way
			FileWriter fw = new FileWriter(capFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\nthrough Buffered writer. second time");
			bw.flush();
			bw.close();
		} catch (IOException e) {
		}
		
	}

}
