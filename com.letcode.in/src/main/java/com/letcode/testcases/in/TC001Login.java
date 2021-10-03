package com.letcode.testcases.in;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.letcode.projectsepecified.in.ProjectSpecifiedMethods;
import com.letcodepages.in.LoginPages;

public class TC001Login extends ProjectSpecifiedMethods{
	
	@BeforeTest
	public void SetData() {
		Excelname = "TC001";
		Sheetname = "Sheet1";
	}
	
		/*
		 * LoginPage lp=new LoginPage();// this method is used to call based on object
		 * or return we can use lp.enterUsername(null); lp.enterPassword(null);
		 */
	@Test
	(dataProvider = "Data")
		public void LoginTest(String Username,String Password) {

		new LoginPages(driver).enterUsername(Username).enterPassword(Password).clickLogin();

	}
}
