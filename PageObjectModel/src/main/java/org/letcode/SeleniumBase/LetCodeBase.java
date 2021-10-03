package org.letcode.SeleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utlis.ReadExcelClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeBase {
	String URL = "https://letcode.in/signin";
	public RemoteWebDriver driver = null;
	public String Excelname;// declared globally to pass dynamically
	public String Sheetname;//declared globally to pass dynamically
	
	@DataProvider(name="Data")
	public Object[][] dataProvider() throws Exception {
		Object[][] excelobj=ReadExcelClass.getExcelData(Excelname, Sheetname);
		return excelobj;
	}

	@BeforeMethod
	public void StartApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);

	}
	@AfterMethod
	public void close() {
		//driver.quit();
	}

}
