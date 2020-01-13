package com.cts.activity.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String path="C:\\Users\\DELL\\Desktop\\data.txt";
		FileInputStream fin=new FileInputStream(path);
		FileOutputStream fout=new FileOutputStream("copied.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
		fin.close();
		fout.close();
		

	}

}
