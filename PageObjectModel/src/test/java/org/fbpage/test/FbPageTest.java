package org.fbpage.test;

import org.facebook.com.BaseConfigLingualLang;
import org.fbpages.FaceBookpages;
import org.letcode.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbPageTest extends BaseConfigLingualLang {
	

	
	@Test
	public void loginFaceBook() {
	//	FaceBookpages fb=new FaceBookpages(driver, prop);
		new FaceBookpages(driver, prop)
		.enterFBname(prop.getProperty("user"))
		.enterFBpass(prop.getProperty("pass"))
		.fbclick();
		//forgot();
		
	}
}
