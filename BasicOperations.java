package com.cts.activity.main;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasicOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileSystem fs= FileSystems.getDefault();
		
		Path path=fs.getPath("C:/Users/DELL/Desktop/data1.txt");
		System.out.println("Name count"+path.getNameCount());
		System.out.println("is absolute"+path.isAbsolute());
		//Files.delete(path);
		Files.createDirectory(path);

	}

}
