package com.utkicode.patterns;
import java.util.*; 
import java.io.*;

class Main {


  public static void main (String[] args) {  
	  String str = "String - is a squence of chars:~!@#$%^&*(). Test.";
		System.out.println(str);
		String result = str.replaceAll("\\p{Punct}", "");
		String test[] = result.split(" ");
		for(int i = 0; i<test.length-1; i++)
		{
			System.out.print(test[i]+"_");
		}
		System.out.println(test[test.length-1]);
		Scanner scanner = new Scanner(System.in);
		
  }

}