package day19;

public class Program02_SumOFTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD123E5";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Integer.parseInt(str.charAt(i)+"");
				
			}
			
		}
		System.out.println(sum);
				
		
		String str3="ABCD123E5";
		int sum2=0;
		String temp="0";
		for(int i1=0;i1<=str.length()-1;i1++)
		{
		if(Character.isDigit(str3.charAt(i1)))	
		{
			temp=temp+str3.charAt(i1);
		}
		else
		{
			sum2=sum2+Integer.parseInt(temp);
			temp="0";
					
		}
		}
		System.out.println(sum2+Integer.parseInt(temp));
		}
			
		}

	