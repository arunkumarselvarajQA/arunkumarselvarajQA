package DemoTest;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA extends BaseClass {
	@BeforeClass
	public void setUp()
	{
		BaseClass.setDriver();
		System.out.println("Browser setup by Thread "+Thread.currentThread().getId()+" and Driver reference is : "+BaseClass.getDriver());
	}
 
	@Test
	public void GoogleTest( Method m) throws InterruptedException
	{
		System.out.println(m.getName()+" of class TestOneWithStaticWebDriver Executed by Thread "+Thread.currentThread().getId()+" on driver reference "+BaseClass.getDriver());
		BaseClass.getDriver().get("https://www.google.com/");
		Thread.sleep(15000);
		System.out.println("Title printed by Thread "+Thread.currentThread().getId()+" - "+BaseClass.getDriver().getTitle()+" on driver reference "+BaseClass.getDriver());
		BaseClass.getDriver().manage().deleteAllCookies();
	}
	
}
