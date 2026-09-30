package day05;

public class Program02_ReversingTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int reverse=0;
		for(;num>0;)
		{
			
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
			
		}
			System.out.println("REVERSE:"+reverse);
			if(num==reverse)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
			
	}

}
