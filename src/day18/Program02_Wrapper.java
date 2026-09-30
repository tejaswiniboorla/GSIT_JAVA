package day18;

public class Program02_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//autoboxing
		int num=10;
		
		Integer num2=num;
		
		//unboxing
		int num3=num2;
		
		//String "10"-----int 10
		String data="10";
		int total=Integer.parseInt(data);
		System.out.println(total);
		
		char alpha='1';
		if(Character.isDigit(alpha))
			System.out.println("is it Digit");
		
		int num7=10;
		String data7=num7+"";//"10"
		
		System.out.println(10+10);
		System.out.println(10+""+10);
		
		char alpha2='A';
		//Character strk=alpha2;
		String data2=alpha2+"";

	}

}
