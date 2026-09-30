package day29;

class EmployeeInfo
{
	static private String companyName;
	private EmployeeInfo()
	{
		
	}
	static String getObj()
	{
		if(companyName==null)
			return companyName=new String("Infosys pvt Limited");
		else
			return companyName;
	}
}

public class Program02_SIngleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1=EmployeeInfo.getObj();
		String obj2=EmployeeInfo.getObj();
		if(obj1==obj2)
			System.out.println("Same Object");
		System.out.println("Obj1");
		System.out.println("obj2");

	}

}
