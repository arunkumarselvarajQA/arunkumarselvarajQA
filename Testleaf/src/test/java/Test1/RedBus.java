package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement From = driver.findElement(By.id("src"));

		From.click();
		From.sendKeys("Chennai");
		Thread.sleep(1000);
		From.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("dest"));

		to.click();
		to.sendKeys("Coimbatore");
		Thread.sleep(1000);
		to.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("onward_cal")).click();
		WebElement date=	driver.findElement(By.xpath("(//td[@class=\"wd day\"])[2]"));
		date.click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class=\"icon icon-close c-fs\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class=\"icon icon-close\"]")).click();
		
		WebElement ac= 	driver.findElement(By.xpath("//label[@for=\"bt_SLEEPER\"]"));
			Thread.sleep(1000);
			ac.click();
	}

}

//*[@id="search"]/div/div[1]/div/ul/li[1]
