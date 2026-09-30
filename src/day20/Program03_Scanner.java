package day20;

import java.util.Scanner;

import.util*;
public class Program03_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		float marks=sc.nextFloat();
		System.out.println(marks);
		char alpha=sc.next().charAt(0);
        System.out.println(alpha);
        String str=sc.next();
		System.out.println(str);
		boolean result=sc.nextBoolean();
		System.out.println(result);
		sc.nextLine();
		String line=sc.nextLine();
		System.out.println(line);
		}

}
