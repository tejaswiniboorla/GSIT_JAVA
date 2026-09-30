package selenium_day01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program04_FormHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		WebElement countryTag=driver.findElement(By.id("country"));
		Select selectCountry=new Select(countryTag);
		selectCountry.selectByIndex(7);
		Thread.sleep(3000);
		selectCountry.selectByVisibleText("India");
		Thread.sleep(3000);
		selectCountry.selectByValue("russia");
		List<WebElement>checkboxList=
		driver.findElements(By.name("ProgrammingLang"));
		checkboxList.get(2).click();
		Thread.sleep(3000);
		checkboxList.get(4).click();
		Thread.sleep(3000);
		driver.findElement(By.id("date")).sendKeys("15-08-2026");
		Thread.sleep(3000);
		driver.findElements(By.name("gender")).get(1).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload"))
		.sendKeys("C:\\Users\\tboorla\\Downloads");
	}
}
