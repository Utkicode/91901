package com.utkicode.patterns;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Solution.Digits(number);
		

	}
	static void Digits(int n)
	{
	    int largest = 0;
	    int smallest = 9;
	 
	    while(n != 0)
	    {
	        int r = n % 10;
	 
	        // Find the largest digit
	        largest = Math.max(r, largest);
	 
	        
	 
	        n = n / 10;
	    }
	    System.out.println(largest);
	}

}
