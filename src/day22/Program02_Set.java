package day22;


import java.util.*;

public class Program02_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>set=new TreeSet<Integer>();
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(30);
		set.add(20);
		System.out.println(set);
		for(Integer num:set)
			System.out.print(num+" ");
		
		System.out.println();
		Iterator<Integer>it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
