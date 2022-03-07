package com.utkicode.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class CreateNewFile {
	public static void main(String[] args) {
		try
		{
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\91901\\eclipse-workspace\\FileHandling\\src\\input.txt"));
			File file = new File("output.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.append("nvvbj");
		}catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
