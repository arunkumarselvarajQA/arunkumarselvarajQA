package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static  void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
}
