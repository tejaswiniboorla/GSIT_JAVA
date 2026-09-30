package day17;

public class Program03_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		str.concat(" world");
		System.out.println(str);
		str=str.concat(" world");
		System.out.println(str);
				
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		String str4=new String("hello");
		//content
		if(str1.equals(str3))
		{
			System.out.println("one");
			//address
			if(str1==str2)
				System.out.println("two");
			if(str3==str4)
			{
				System.out.println("three");
			}
		}
	}

}