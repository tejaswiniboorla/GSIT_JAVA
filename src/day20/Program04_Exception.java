package day20;

public class Program04_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			int num=10/0;
			System.out.println("Bye");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Bye-2");
		}
	}

}
