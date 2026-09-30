package Seleniumday04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01_Table {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		List<WebElements>rows=driver.findElements(By.xpath(null));
		for(int i=1;i<=rows.size();i++)
		{
			String id=driver.findElement(By.xpath(null)).getText();
			System.out.println(;)
		}
	}

}
