package Seleniumday04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02_DD {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			driver.manage().window().maximize();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//*[text()='From']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='PNQ']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='MAA']")).click();
	}

}
