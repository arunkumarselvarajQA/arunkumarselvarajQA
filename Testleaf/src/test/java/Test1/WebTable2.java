package Test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("chkSelectDateOnly"));
		checkbox.click();
		WebElement table = driver
				.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		Thread.sleep(8000);
		List<WebElement> rowname=	table.findElements(By.tagName("tr"));
		System.out.println(rowname);

	}

}
