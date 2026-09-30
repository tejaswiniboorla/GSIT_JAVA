package day14;

class Test
{
	int num1;
	int num2;
	private char[] numberOfStudents;
	void hello()
	{
		System.out.println("hello");
		}
	Test(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	void bye()
	{
		
		this.hello();
		System.out.println(this.num1+" "+this.num2+" ");
		System.out.println(this.numberOfStudents);
		
	}
}
public class Program05_ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(10,20);
		System.out.println(t1.num1);
		System.out.println(t1.num2);
	}

}
