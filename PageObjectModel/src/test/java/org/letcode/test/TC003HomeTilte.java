package org.letcode.test;

import org.letcode.SeleniumBase.LetCodeBase;
import org.letcode.pages.HomePage;
import org.letcode.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003HomeTilte extends LetCodeBase {
	String TestDataName = "LetCode with Koushik";

	@Test
	public void Hometitlename() {
		HomePage lp = new HomePage(driver);
		String CheckHomeText = lp.getHometitle();
		//if(CheckHomeText.equals(TestDataName)) {
			Assert.assertEquals(TestDataName, CheckHomeText);
			
	//}
}
}