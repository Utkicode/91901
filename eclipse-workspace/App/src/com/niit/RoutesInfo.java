package com.niit;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoutesInfo {
	public List<List<String>> displayDetails()
	{
		
		List< List<String> > data = new ArrayList<>();
		try
		{
			//list of lists to store data
			String filePath = "C:\\Users\\91901\\eclipse-workspace\\FileHandling\\src\\com\\utkicode\\filehandling\\routes.csv";//file path
			File file = new File(filePath);
			Scanner s = new Scanner(file);			
			//Reading until we run out of lines
			while(s.hasNextLine())
			{
				List<String> lineData = Arrays.asList(s.nextLine().split(","));//splitting lines
				data.add(lineData);
			}			
			//printing the fetched data
			for(List<String> list : data)
			{
				for(String str : list)
					System.out.print(str + " ");
				System.out.println();
			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

		return data;
	}
}
