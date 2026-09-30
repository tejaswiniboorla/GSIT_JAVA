package day28;

import java.lang.reflect.Method;

@interface GSIT
{
	String batchCode() default "2026";

}
class Demo
{
	protected static String demoId;
	@GSIT(batchCode="May-2026")
	void printData()
	{
		//System.out.println(batchCode);
	}
	
}

public class Program04_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<Demo>obj=Demo.class;
		Method[]methods=obj.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println(method.getName()+" ");
			GSIT ann=method.getDeclaredAnnotation(GSIT.class);
			System.out.println(ann.batchCode());
					
		}
	}

}
