package day27;

import java.io.ObjectInputStream;

public class Program06_Deserialzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User("Rahul","Abcd@123");
		File file=new File("C:\Users\tboorla\OneDrive - Capgemini\Desktop\ReadData.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		User obj=(User)ois.readObject();
		System.out.println(obj.username+":"+obj.password);
		

	}

}
