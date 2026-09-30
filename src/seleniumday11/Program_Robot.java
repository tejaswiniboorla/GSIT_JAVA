package seleniumday11;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_Robot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		WebDriver driver=new ChromeDriver();
		

		driver.manage().window().maximize();

		driver.get("https://www.engineerdiaries.com/selenium");

		Thread.sleep(7000);

		Actions act=new Actions(driver);

		act.contextClick().perform();

		Thread.sleep(2000);

		for(int i=1;i<=3;i++)

		{

			Robot robot=new Robot();

			robot.keyPress(KeyEvent.VK_DOWN);

			robot.keyRelease(KeyEvent.VK_DOWN);

			Thread.sleep(2000);

		

		}

	}

}
