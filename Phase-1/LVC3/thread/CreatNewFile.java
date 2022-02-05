package com.simplilearn.thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatNewFile {
	private static void createFileUsingFileClass() throws IOException {
		File file=new File("C:\\Users\\Asus\\Mphasis2\\testFile1.txt");
		// Creating file :
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already exist");
		}
		
		//Writing Content :
		FileWriter writer=new FileWriter(file);
		writer.write("Hello \n\tWelcome to File test");
		writer.close();
	}
	public static void main(String[] args)throws IOException {
		createFileUsingFileClass();
	}
	
}
