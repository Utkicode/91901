package com.utkicode.patterns;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i = 0; i<num.length; i++)
		{
			num[i] = scanner.nextInt();
		}
		for(int i = 0;i<num.length;i++)
		{
			int number = num[i];
			if(perfectCube(number) == 1)
			{
				
				count++;
			}
		}
		System.out.println(count);

	}
	public static int perfectCube(int num)
	{
		int cube;
		for(int i = 0; i<num; i++)
		{
			cube = i*i*i;
			if(cube == num)
			{
				return 1;
			}
		}
		return 0;
	}

}
