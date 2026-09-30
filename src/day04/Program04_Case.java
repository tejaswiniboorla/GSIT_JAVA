package day04;

public class Program04_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch='Q';
			if(ch>='A' && ch<='Z')
				System.out.println("Uppercase");
			else if(ch>='a' && ch<='z')
				System.out.println("Lowercase");
			else if(ch>='0' && ch<='9')
				System.out.println("Digit");
			else
				System.out.println("Special Character");
			
	}

}
