package org.letcode.test;

import static org.testng.Assert.assertEquals;

import org.letcode.SeleniumBase.LetCodeBase;
import org.letcode.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001Login extends LetCodeBase {

	@BeforeTest
	public void SetData() {
		Excelname = "TC001";
		Sheetname = "Sheet1";
	}

	//@Test(dataProvider = "Data")
	/*
	 * public void LoginTest(String[] data) {
	 * 
	 * LoginPage lp=new LoginPage();// this method is used to call based on object
	 * or return we can use lp.enterUsername(null); lp.enterPassword(null);
	 * 
	 * LoginPage lp = new LoginPage(driver);// where we called constructor then need
	 * to pass driver boolean usernamelabel = lp.getUsernamelabel();
	 * Assert.assertEquals(usernamelabel, true); boolean
	 * userPasswordlabel=lp.getPasswordlabel();
	 * Assert.assertEquals(userPasswordlabel, true);
	 * 
	 * new LoginPage(driver) .enterUsername(data[0]) .enterPassword(data[1])
	 * .clickLogin();
	 * 
	 * }
	 */
	@Test(dataProvider = "Data")
	public void LoginTest(String Username,String Password) {
		/*
		 * LoginPage lp=new LoginPage();// this method is used to call based on object
		 * or return we can use lp.enterUsername(null); lp.enterPassword(null);
		 */
		LoginPage lp = new LoginPage(driver);// where we called constructor then need to pass driver
		boolean usernamelabel = lp.getUsernamelabel();
		Assert.assertEquals(usernamelabel, true);
		boolean userPasswordlabel = lp.getPasswordlabel();
		Assert.assertEquals(userPasswordlabel, true);

		new LoginPage(driver).enterUsername(Username).enterPassword(Password).clickLogin();

	}
}
