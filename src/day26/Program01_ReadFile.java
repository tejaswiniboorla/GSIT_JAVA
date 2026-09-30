package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program01_ReadFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\tboorla\\OneDrive - Capgemini\\Desktop\\ReadData.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

	}

}
