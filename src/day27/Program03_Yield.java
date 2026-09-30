package day27;
class MyThreadC extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==1)
				Thread.yield();
		}
	}
}

public class Program03_Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method 
MyThreadC t1=new MyThread();
t1.start();

MyThreadC t2=new MyThread();
t2.start();
	}

}
