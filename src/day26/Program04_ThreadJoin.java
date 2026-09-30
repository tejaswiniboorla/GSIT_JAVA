package day26;

class MyThradE extends Thread
{
 public void run()
 {
	 System.out.println("Hello");
 }
}
public class Program04_ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadE t1= new MyThreadE();
		t1.start();
		t1.join();
		
		System.out.println("Bye");

	}

}
