package day28;

public class Program02_Finalize {
	
	int num;
	protected void finalize()throws Throwable {
		System.out.println("GC is called");
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Program_finalize obj1=new Program_finalize();
		obj1.num=10;
		
		Program_finalize obj2=obj1;
		System.out.println("one");
		
		obj1=null;
		
		System.out.println("two");
		System.out.println(obj2.num);
		
		obj2=null;
		System.gc();
		System.out.println("three");
	}

}
