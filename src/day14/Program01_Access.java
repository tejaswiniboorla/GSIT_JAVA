package day14;

public class Program01_Access {

	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	void print()
	{
		System.out.println(privateNum+""+defaultNum+""+protectedNum+""+publicNum);
	}

}
