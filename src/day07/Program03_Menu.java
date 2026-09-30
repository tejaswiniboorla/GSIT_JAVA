package day07;
import java.util.*;
public class Program03_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;

		do

		{

			System.out.println("Menu:"+

				"\n1. Press 1 to print square of 4"+

				"\n2. Press 2 to check if 4 is even or odd"+

				"\n3. Press 3 to print"+ 

				   "\n****"+

				   "\n*  *"+

				   "\n*  *"+

				   "\n****"+

				"\n4. Press any other Key to exit");

			Scanner sc=new Scanner(System.in);

			 num=sc.nextInt();

			 if(num==1)

				 System.out.println("Square is 16");

			 else if(num==2)

				 System.out.println("4 is even");

			 else if(num==3)

				 System.out.println(

						 "****"+

						   "\n*  *"+

						   "\n*  *"+

						   "\n****" 

						 );

			 else

				 System.out.println("SUCCESSFULLY EXITED!");

				 

		}while(num<=3 && num>=1);
		
	}
}