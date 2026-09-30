package day08;

public class Program02_BreakWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int num=1;
		while(num<=10)
		{
			if(num==7)
			{
				System.out.println("Numnber is found");
				break;
				
			}
			System.out.println(num);
			num++;
		}
		System.out.println("Bye");
	}

}


	
