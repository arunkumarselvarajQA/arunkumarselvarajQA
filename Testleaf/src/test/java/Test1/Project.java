package Test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.xpath("//a[text()='Men']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).sendKeys(Keys.F8).perform();
	WebElement ele1=	driver.findElement(By.xpath("//a[text()='Jackets']"));
	ele1.click();
	WebElement ele2=	driver.findElement(By.xpath("//span[@class='title-count']"));
	String totalvalue=ele2.getText();
	String repItem = totalvalue.replaceAll("[^0-9]", "");
	int count = Integer.parseInt(repItem);
	System.out.println("Total count: " + count);

	WebElement ele3=	driver.findElement(By.xpath("//span[@class='categories-num']"));
	String Catvalue=ele3.getText();
	String repItem2 = Catvalue.replaceAll("[^0-9]", "");
	int count2 = Integer.parseInt(repItem2);
	System.out.println("cat1 count: " + count2);
	
			WebElement ele4=	driver.findElement(By.xpath("(//span[@class='categories-num'])[2]"));
			String Catvalue2=ele4.getText();
			String repItem3 = Catvalue2.replaceAll("[^0-9]", "");
			int count3 = Integer.parseInt(repItem3);
			System.out.println("cat2 count: " + count3);
			int sum=count2+count3;
			if(sum==count) {
				System.out.println("matched");
			
			}
			else
				System.out.println("Not matched");
			
			WebElement ele5=driver.findElement(By.xpath("//div[@class='brand-more']"));
			ele5.click();
			WebElement ele6=	driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			ele6.sendKeys("Duke");
			ele6.click();
			WebElement ele7=	driver.findElement(By.xpath("//label[@class=' common-customCheckbox']/div"));
			ele7.click();
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
			List<WebElement> ele8=driver.findElements(By.xpath("//div[@class='search-searchProductsContainer row-base']"));
			for (WebElement all:ele8) {
				if(((List<WebElement>) all).contains("Duke")) {
					System.out.println("Duke all items");
				}
				else {
					System.out.println("No Duke");
				}
				
			}
			WebElement ele9=	driver.findElement(By.xpath("//span[text()='Recommended']"));
			//Actions act1=new Actions(driver);
			//act1.moveToElement(ele9).perform();
			ele9.click();
			driver.findElement(By.xpath("//span[text()='Better Discount']")).click();
			WebElement ele10=driver.findElement(By.xpath("//span[@class='product-discountedPrice']"));
			String Disvalue2=ele10.getText();
			String repItem4 = Disvalue2.replaceAll("[^0-9]", "");
			int count4 = Integer.parseInt(repItem4);
			System.out.println("Disvalue2 count: " + count4);
			WebElement ele11=driver.findElement(By.xpath("//span[@class='product-discountedPrice']"));
			ele11.click();
	}

}
