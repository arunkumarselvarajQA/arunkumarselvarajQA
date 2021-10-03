package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		ele.click();
		Alert al=driver.switchTo().alert();
		String name=al.getText();
		System.out.println(name);
		al.accept();
		WebElement text=	driver.findElement(By.id("result"));
		String name1=text.getText();
		if(name1.contains("OK")) {
			System.out.println("Alet text is ok");
		}
		else
		{
			System.out.println("Alet text is different");
		}
	}

}
