package day22;
import java.util.*;
public class Program03_Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the day today is very very very cold day";
		String[]words=str.split(" ");
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		String output="";
		StringBuilder sb=new StringBuilder();
		for(String word:words)
		{
			set.add(word);
			
		}
		for(String s:set)
		{
			sb.append(s).append(" ");
		}
		output=sb.toString().trim();
		System.out.println(output);
	}

}
