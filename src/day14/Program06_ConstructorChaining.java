package day14;

class User
{
	String name;
	int age;
	User()
	{
		System.out.println("default constructor called");
	}
	User(String name,int age)
	{
		this();
		this.name=name;
		this.age=age;
		
	}
	User(String name)
	{
		this(name,-1);
	}
	void hello()
	{
		System.out.println();
	}
}

public class Program06_ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User User1=new User("Rajat",9);
		System.out.println(User1.age+":"+User1.name);
		
		User User2=new User("Rajat",-9);
		System.out.println(User2.age+":"+User2.name);

}
}