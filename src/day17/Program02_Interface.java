package day17;
interface ITestA
{
	int num1=10;
	final static public int num2=20;
	void hello();
	default void bye()
	{
		System.out.println("BYE");
	}
	static void grade()
	{
		System.out.println("You have got A+ grade");
	}
	}
	Interface ITestB
		{
		int num1=100;
		int hello();
		}
	class TestX implements ITestA,ITestB
	{
		
		public void hello()
		{
			System.out.println("HELLO"+num1);
		}
	}

public class Program02_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestX obj=new TestX();
		obj.hello();
		System.out.println(ITestA.num1);
				
	}

}
