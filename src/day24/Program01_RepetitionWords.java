package day24;
import java.util.*;
public class Program01_RepetitionWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the day today is very very very cold day";
		String[]words=str.split(" ");
		TreeMap<String,Integer>map=new TreeMap<String,Integer>();
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				int value=map.get(word);
				value++;
				map.put(word, value);
			}
			else
				map.put(word, 1);
		}
System.out.println(map);
	}

}
