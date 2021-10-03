package com.letcodepages.in;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.letcode.projectsepecified.in.ProjectSpecifiedMethods;

public class LoginPages extends ProjectSpecifiedMethods {
	public LoginPages(RemoteWebDriver driver) {
		this.driver=driver;
		
	}

	public LoginPages enterUsername(String StoreData) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='email']"), StoreData);
		//reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPages enterPassword(String StoreData) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='password']"), StoreData);
		//reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement(Locators.XPATH, "//button[@class='button is-primary']"));
		//reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
