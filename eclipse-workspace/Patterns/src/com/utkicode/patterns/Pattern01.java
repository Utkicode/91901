package com.utkicode.patterns;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		Pattern(n);
		sc.close();
		
	}
	static void Pattern(int n)
	{
		for(int rows = 0; rows<2*n; rows++)
		{
			int totalcol;
			if(rows>n)
			{
				totalcol = 2*n-rows;
			}
			else
			{
				totalcol = rows;
			}
			for(int col = 0; col<totalcol; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//*
//**
//***
//****
//*****
//****
//***
//**
//*
