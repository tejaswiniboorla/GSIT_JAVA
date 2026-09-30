package selenium_day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03_Input {

	public static void main(String[] args) throws Exception	  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement inputBox=driver.findElement(By.id("input.text"));
		inputBox.clear();
		Thread.sleep(3000);
		inputBox.sendKeys("GSIT");
	}

}
