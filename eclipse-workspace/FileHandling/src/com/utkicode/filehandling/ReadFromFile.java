package com.utkicode.filehandling;
import java.io.*;
public class ReadFromFile {

	public static void main(String[] args)  {
		
		try {
			String pathInput = "C:\\Users\\91901\\eclipse-workspace\\FileHandling\\src\\input";
			String pathOutput = "C:\\Users\\91901\\Desktop\\output.txt";
			BufferedReader bufferedReader = new BufferedReader(new FileReader(pathInput));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOutput));
			String curLine;
	        while ((curLine = bufferedReader.readLine()) != null){
	            //process the line as required
	            //System.out.println(curLine);
	        	
	        	String [] row = curLine.split(",");
                for(int i=0;i<row.length-1;i++){
                    row[i]= row[i].substring(0, 1).toUpperCase() + row[i].substring(1).toLowerCase();
                    bufferedWriter.append(row[i] + ",");
                }
                row[row.length-1] = row[row.length-1].substring(0, 1).toUpperCase() + row[row.length-1].substring(1).toLowerCase();
                System.out.println("Succesfully Write!");
	        	
	        }
	        bufferedReader.close();
	        bufferedWriter.close();
		}catch(Exception exception)
		{
			System.out.println(exception);
		}
        
	}

}
