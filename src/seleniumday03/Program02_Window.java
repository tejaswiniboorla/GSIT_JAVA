package seleniumday03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		String parentTab=driver.getWindowHandle();
		
		driver.findElement
		(By.xpath("//*[@id="root"]/div[4]/div/div/section[16]/div/div/div/button[1]"))
		.click();
		Thread.sleep(3000);
		driver.switchTo().window(parentTab);
		Thread.sleep(3000);
		
		
		
		driver.findElement
		(By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[16]/div/div/div/button[1]]"))
		.click();
		Thread.sleep(3000);
		driver.findElement
		(By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[16]/div/div/div/button[1]"))
		.click();
		Thread.sleep(3000);

		
		driver.switchTo().window(parentTab);
		
		}

}
