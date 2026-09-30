package day27;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program02_ExecutorThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=1;i<=20;i++)
		{
			executor.submit(new MyThreadB());
		
		
		}
		executor.shutdown();
	}

}
