package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CopyFile {

	
	
	
	public static void main (String args[]) {
		FileInputStream in=null;;
		FileOutputStream out=null;
		
		try {
			//create a file
			File createFile = new File("D:\\MyFile.txt");
			createFile.createNewFile();
			
			//create a file
			File createFile2 = new File("D:\\MyFile_COPY.txt");
			createFile2.createNewFile();
			
			//write in a file
			FileWriter writer = new FileWriter("D:\\MyFile.txt");
			writer.write("My new salary is 5.85LPA");
			writer.close();
			
			
			//copy to a new file
			
			in= new FileInputStream("D:\\MyFile.pdf");
			out = new FileOutputStream("D:\\MyFile_COPY.txt");
			
			int i=0;
			while((i=in.read())!=-1) {
				out.write(i);
			}
			out.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Some error happenned");
		}
		
		
		
		
	}
	
}
