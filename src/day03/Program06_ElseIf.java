package day03;

public class Program06_ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		if(num==0)
		{
			System.out.println("zero number");
		}
		else if(num%2==0)
		{
			System.out.println("Even number");
		}
		else if(num%5==0)
		{
			System.out.println("Multiple of 5");
		}
		else
		{	
			System.out.println("Could not guess");
		}
		}
	}


