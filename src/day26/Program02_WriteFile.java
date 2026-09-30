package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Program02_WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\tboorla\\OneDrive - Capgemini\\Desktop\\ReadData.txt");
		
		try(FileWriter fr=new FileWriter(file,true))
		{
			fr.write("\nten");
			//fr.close();
			System.out.println("output done");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}