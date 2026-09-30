package day26;
class MyThreadA extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread()+getId()+" ");
		
	
	}
	
		// TODO Auto-generated method stub
		
	}


public class Program03_Thread {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			MyThreadA t1=new MyThreadA();
			t1.start();
		}
		

	}

}
