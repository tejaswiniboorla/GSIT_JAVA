package day05;

public class Program01_SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int sum=0;
		for(;num>0;)
		{
			int lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
		}
			System.out.println("Sum of the Digits:"+sum);
		}

	}


