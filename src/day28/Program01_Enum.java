package day28;
enum Course
{
	Java,
	C,
	Python,
	Selenium
};
class StudentRecord
{
	int rollNo;
	String name;
	Course course;
	public StudentRecord(int rollNo, String name, Course course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		
	}
}
public class Program01_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentRecord obj=new StudentRecord(101,"Rahul",Course.C);
		System.out.println(obj.rollNo+":"+obj.name+":"+obj.course);
	}

}
