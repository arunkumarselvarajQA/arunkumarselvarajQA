package DemoTest;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassB extends BaseClass{
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		BaseClass.setDriver();
		System.out.println("Browser setup by Thread "+Thread.currentThread().getId()+" and Driver reference is : "+BaseClass.getDriver());
	}
	
 
	@Test (groups = { "Online" })
	public void FlipkartTest(Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+BaseClass.getDriver());
		BaseClass.getDriver().get("https://www.flipkart.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+BaseClass.getDriver().getTitle()+" on driver reference "+BaseClass.getDriver());
		BaseClass.getDriver().manage().deleteAllCookies();
		
	}
}
