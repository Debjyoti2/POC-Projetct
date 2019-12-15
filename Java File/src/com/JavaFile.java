package com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaFile {

	public static void main(String args[]) {
		try {
			
			
			//create file
			File newFile = new File("D:\\Salary.xls");
			newFile.createNewFile();
			
			//write in file
			FileWriter writer = new FileWriter("D:\\Salary.xls");
			writer.write("Hi i am new gen salary slip");
			writer.close();
			
			//read the file
			File readFile = new File("D:\\Salary.xls");
			Scanner scan = new Scanner(readFile);
			
			while(scan.hasNextLine()) {
				String s = scan.nextLine();
				System.out.println(s);
			}
			
			
			//delete file
			File deleteFile = new File("D:\\Salary.xls");
			System.out.println("We are deleting the file" + deleteFile.getName());
			deleteFile.delete();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
