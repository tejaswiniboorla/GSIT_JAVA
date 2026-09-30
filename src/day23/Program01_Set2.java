package day23;
import java.util.*;

class emp
{
	int empId;
	String empName;
	public emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	
	
}

public class Program01_Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Emp e1=new Emp(1,"Rajat");
	System.out.println(e1.hashcode());
	
	Emp e2=new Emp(1,"Rajat");
	System.out.println(e2.hashcode());
	
	
	
	
	

	}

}
