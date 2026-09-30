package day23;

import java.util.*;
import java.util.Map.Entry;
public class Program02_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(10,"Rajat");
		map.put(9,"Rahul");
		map.put(10,"Teja");
		map.put(11,"Shreya");
		System.out.println(map);
		System.out.println(map.get(9));
		map.remove(10);
		System.out.println(map);
		System.out.println(map.containsKey(11));
		
		for(Entry<Integer,String>e:map.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
			
				
	}

}
