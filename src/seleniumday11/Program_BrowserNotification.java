package seleniumday11;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Program_BrowserNotification {
public static void main(String[] args) {
ChromeOptions options = new ChromeOptions();

HashMap<String, Object> prefs = new HashMap<>();

prefs.put("profile.default_content_setting_values.notifications", 2);

prefs.put("profile.managed_default_content_settings.geolocation", 2);

options.setExperimentalOption("prefs", prefs);

options.addArguments("--use-fake-ui-for-media-stream");
options.addArguments("--deny-permission-prompts");
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.spicejet.com/");

}
}