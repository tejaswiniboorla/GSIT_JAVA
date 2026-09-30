package day21;

public class Program03_CustomException {
	static void checkAge(int age) throws Exception
	{
		if(age<18)
			System.out.println("you are not 18 yet");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(16);
			System.out.println("Bye");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
