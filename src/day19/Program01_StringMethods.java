package day19;

public class Program01_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HELLO world java";
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('h'));
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.replace(' ', '-'));
		System.out.println(str.substring(1,3));
		System.out.println(str.toLowerCase());
		
		
		String str2="             hello      ";
		System.out.println(str2.trim());
		
		String str3="hello-world-java";
		String[]words=str3.split("-");
		System.out.println(words[1]);

	}


}