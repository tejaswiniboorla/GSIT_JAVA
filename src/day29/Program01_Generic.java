package day29;

import java.util.Arrays;
import java.util.List;

class Demo2<T>
{
	void printData(T value)
	{
		System.out.println(value);
	}
}

public class Program01_Generic {
	static void printFirst(List<?>list)
	{
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFirst(Arrays.asList(1,2,3));
		printFirst(Arrays.asList("A","B","C"));
		printFirst(Arrays.asList(1.0,2.0,3.0));
		
		Demo2<String>obj1=new Demo2<String>();
		obj1.printData("hello");
		Demo2<Integer>obj2=new Demo2<Integer>();
		obj2.printData(10);
		Demo2<Boolean>obj3=new Demo2<Boolean>();
		obj3.printData(false);
				

	}

}
