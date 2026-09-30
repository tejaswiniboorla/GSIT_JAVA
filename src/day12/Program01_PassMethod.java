package day12;

public class Program01_PassMethod {

	
		static void increment(int num)
		{
			num++;
		}
		static void increment(int[]arr)
		{
			arr[0]++;
			
		}
		public static void main(String[] args)
		{
			int data=10;
			increment(data);
			System.out.println(data);
			int[]arrA = {100,200,300};
			increment(arrA);
			System.out.println(arrA[0]);
		}
		
	}


