package seleniumday11;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Cookies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		Set<Cookie>cookieSet=driver.manage().getCookies();
		for(Cookie cookie:cookieSet)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		driver.manage().addCookie(new Cookie("hello","hello123"));
		
		System.out.println("****************cookie added");
		cookieSet=driver.manage().getCookies();
		for(Cookie cookie:cookieSet)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		driver.manage().deleteCookieNamed("hello");
		System.out.println("****************cookie deleted");
		cookieSet=driver.manage().getCookies();
		for(Cookie cookie:cookieSet)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
	}

}
