package day24;
@FunctionalInterface
interface Itest
{
	void hello(String name);
	
}

public class Program03_FunctionalInterface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itest obj=(str)->
		{
			System.out.println("Hello!"+str);
		};
		obj.hello("Rajat");
	}

}
