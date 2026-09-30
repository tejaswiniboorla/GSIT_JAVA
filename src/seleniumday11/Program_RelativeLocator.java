package seleniumday11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Program_RelativeLocator {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.engineerdiaries.com/selenium");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		driver.findElement(with(By.tagName("button"))

				.toRightOf(driver.findElement(By.id("alert")))).click();

	}

}
