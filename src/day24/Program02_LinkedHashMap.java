package day24;
import java.util.*;
import java.util.Map.Entry;
public class Program02_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aaabbc";
		LinkedHashMap<Character,Integer>map2=new LinkedHashMap<Character,Integer>();
		for(int i=1;i<input.length();i++)
		{
			if(map2.containsKey(input.charAt(i)))
			{
				int value=map2.get(input.charAt(i));
						value++;
						map2.put(input.charAt(i), value);
			}
			else
			map2.put(input.charAt(i), 1);
		}
		String output="";
		for(Entry<Character, Integer> e:map2.entrySet())
		{
			output=output+e.getKey()+e.getValue();
		}
		System.out.println(output);
	}

}
