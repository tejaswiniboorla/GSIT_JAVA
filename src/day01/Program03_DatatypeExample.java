package day01;

public class Program03_DatatypeExample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//boolean takes 1 bit
		boolean result=false;
		System.out.println(result);
		
		//byte takes 1 byte=8bits
		//-128 to 127
		byte ans=-128;
		System.out.println(ans);
		
		//short takes 2 bytes
		//-320000 to 32000
		short data = -32000;
		System.out.println(data);
		
		//char takes 2 bytes
		char alpha='A';
		System.out.println(alpha);
	
		//int num = 987654321;
		//8 bytes
		long phonenumber=987654321L;
		System.out.println(phonenumber);
		
		//4 bytes 7 floating points
		float marks1=98.123456789F;
		System.out.println(marks1);
		
		float marks2=98.123456789F;
		System.out.println(marks2);
		//8 bytes 15 floating points
		double data3=1234.123456789012345;
		System.out.println(data3);
	}
}



// Long and Double : 8 Bytes
// Int and Float : 4 Bytes
// Short and Char : 2 Bytes
// Byte :1 Byte
// Boolean 1 Bit