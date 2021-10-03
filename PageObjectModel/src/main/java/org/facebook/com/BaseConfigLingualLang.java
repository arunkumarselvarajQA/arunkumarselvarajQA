package org.facebook.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfigLingualLang {
	public String URL;
	public RemoteWebDriver driver = null;
	public Properties prop;
	//public ThreadLocal<Properties> prop = new ThreadLocal<>();
	
	@BeforeMethod
	public void StartApp() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Eclipse_workspace\\PageObjectModel\\src\\test\\resources\\facebookEng.properties");
		 prop = new Properties();
		prop.load(fis);
		String user = prop.getProperty("user");
		String pass = prop.getProperty("pass");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));

}
}