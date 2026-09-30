package day25;

public class Program01_StreamAPI {
	
	
	class stud{
		int rollNo;
		String name;
		String dept;
		int marks;
		public stud(int i, String string, String string2, int j) {
			// TODO Auto-generated constructor stub
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1=new stud(1,"Zainab","ECE",60);
		stud s2=new stud(2,"Yatin","ECE",60);
		stud s3=new stud(3,"Astha","CSE",90);
		stud s4=new stud(4,"Ayushi","CSE",90);
		
		list.add(s1);list.add(s2);list.add(S3);list.add(s4);
		
		System.out.println("Filter Name stats with A");
		
		List<Stud>filterList=list.stream().filter(s->s.name.startsWith("A")).collect(Collectors.ToList());
		.toList();
	}

}
