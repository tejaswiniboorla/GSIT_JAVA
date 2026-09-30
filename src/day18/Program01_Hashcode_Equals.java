package day18;
class Student
{
	int rollNo;
	String name;
	Student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
}

public class Program01_Hashcode_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Aa";
		String str2="BB";
		String str3=new String("Aa");
		System.out.println("str1:"+str1.hashCode());
		System.out.println("str2:"+str2.hashCode());
		System.out.println("str3:"+str3.hashCode());
		
				
		Character c1='A';
		Character c2='B';
		Float f1=10.2F;
		Double d1=10.2;
		Student s1=new Student(1,"A");
		Student s2=new Student(1,"A");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(f1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
				
		if(s1.equals(s2))
			System.out.println("one");
		else
			System.out.println("two");

	}

}
