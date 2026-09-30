package day27;

import java.io.ObjectOutputStream;
import java.io.Serializable;
class User implements Serializable
{
	String username;
	String password;
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	
}

public class Program05_Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User("Rahul","Abcd@123");
		File file=new File("C:\\Users\tboorla\OneDrive - Capgemini\Desktop\ReadData.txt");
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(user);
		

	}

}
