package day28;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Practice
{
	public static int code;
	final String name="hello";
}

public class Program03_ReflectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<Practice>obj=Practice.class;
		Field[]fields=obj.getDeclaredFields();
		for(Field field:fields)
		{
			int modifier=field.getModifiers();
			System.out.println(Modifier.toString(modifier)+" ");
			System.out.println(field.getName());
		}
		
		

	}

}
