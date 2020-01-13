package com.cts.activity.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\DELL\\Desktop\\data.txt";
		File file =new File(path);
		System.out.println("can Execute?:"+file.canExecute());
		System.out.println("can Read?:"+file.canRead());
		System.out.println("can Write?:"+file.canWrite());
		System.out.println("File Exists?:"+file.exists());
		System.out.println("File Name?:"+file.getAbsolutePath());
		
		
		
		
		FileOutputStream fout=new FileOutputStream(file,true);
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		byte []b=msg.getBytes();
		System.out.println("Write Data?:");
		fout.close();

	} 

}
