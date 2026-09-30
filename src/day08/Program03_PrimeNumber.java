package day08;

public class Program03_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=91;
		boolean flag=false;
		if(num==1)
		System.out.println("Neither prime nor composite");
		else if(num==2)
			System.out.println("Prime");
		else if(num%2==0)
			System.out.println("Not Prime");
		else
		{
		for(int fact=3;fact<Math.sqrt(num);fact=fact+2)
		{
			if(num%fact==0)
			{
				flag=true;
				System.out.println("NOT PRIME");
			break;
			}
		}
		
		if(flag==false)
				System.out.println("PRIME");
		}

	}

}
