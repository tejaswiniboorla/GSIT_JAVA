package day13;

import day14.Access;
import day14.Program01_Access;

public class Program02_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program01_Test t1=new Program01_Test();
		t1.print();
		
		Program01_Test t2=new Program01_Test(101,"CBSC EXAM");
		t2.print();
		
		Program01_Test t3=new Program01_Test(101);
		t3.print();
		
		Program01_Access obj=new Program01_Access();
		obj.defaultNum=10;
		
		Access1 obj1=new Access();
		obj1.publicNum=20;
		class parent
		{
			protected void hello()
			{
			System.out.println("hello");	
			}
		}
		class child extends parent
		{
			 protected void hello()
			{
				System.out.println("Bye");
			}
		}
		
		
	
	}

}
