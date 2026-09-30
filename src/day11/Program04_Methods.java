package day11;

public class Program04_Methods {
	static int sum(int num1, int num2)
	{
		return num1+num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultA=sum(10,20);
		System.out.println("sum:"+resultA);
		int resultB=sum(100,200);
		System.out.println("sum:"+resultB);
		
		static void sumOfArray(int arr[])
		{
			int total=0;
			for(int num:arr)
				totla =total+num;
			
			System.out.println(total);
			
		}
		public static void main(String[]args)
		{
			int[]arrB= {10,20,30,40,50};
			SumofArray(arrB);
			
			
			
		}
	}

}
