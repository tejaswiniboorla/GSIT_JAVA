package day21;

public class Program01_Exception {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println("hello");
			String str="";
			
			//System.out.println(str.charAt(7));
			//int num=10/0;
			int [] arr= {10,20,30};
			//System.out.println(arr[100]);
			System.out.println("Bye");
			
			
		}
		catch(ArithmeticException ex)
		{
			
			System.out.println("Exception 1");
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception 2");
		}
		catch(Exception ex)
		{
			System.out.println("Exception 3");
		}
		finally
		
		{
			System.exit(0);
			System.out.println("I will always execute");
		}
		}
	}


