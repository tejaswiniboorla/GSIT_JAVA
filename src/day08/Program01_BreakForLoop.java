package day08;

public class Program01_BreakForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				System.out.println("Numnber is found");
				break;
				
			}
			System.out.println(i);
		}
		System.out.println("Bye");
	}

}
