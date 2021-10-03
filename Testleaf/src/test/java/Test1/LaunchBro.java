package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBro {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user= driver.findElement(By.id("username"));
		user.sendKeys("demosalesmanager");
		WebElement pass	=driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		WebElement	click1=driver.findElement(By.className("decorativeSubmit"));
		click1.click();
		WebElement	link=driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		String checktitle="My Home | opentaps CRM";
		String sourcetitle=driver.getTitle();
		System.out.println(sourcetitle);
		if(checktitle.contentEquals(sourcetitle)) {
			System.out.println("Home page landed correctly");
		}
		else {
			System.out.println("Not Home page landed correctly");
		}
		
		WebElement	home=driver.findElement(By.linkText("Create Lead"));
		home.click();
		
		WebElement	company=driver.findElement(By.id("createLeadForm_companyName"));
		company.click();
		company.sendKeys("mycompany");
		WebElement	firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.click();
		firstname.sendKeys("mycompany");
		WebElement	lastname=driver.findElement(By.id("createLeadForm_lastName"));
		lastname.click();
		lastname.sendKeys("mycompany");
		WebElement	countrycode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.click();
		countrycode.clear();
		countrycode.sendKeys("2");
		WebElement	submit=	driver.findElement(By.name("submitButton"));
		submit.click();
		WebElement attri=	driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String value=attri.getText();
		System.out.println("value of text "+ value);
		String attributevalue=attri.getAttribute("id");
		System.out.println("value of attribute "+ attributevalue);
	}

}
