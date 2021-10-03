package org.letcode.pages;

import org.letcode.SeleniumBase.LetCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends LetCodeBase {
	// RemoteWebDriver driver = null;
	// constructor of same class called to avoid instead of giving static method for
	// null pointer exception
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

// locators
	public boolean getUsernamelabel() {
		return driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
	}

	public boolean getPasswordlabel() {
		return driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
	}

//Actions
	/**
	 * @description get the data from user and input on the field
	 * @param username-pass the user to be login
	 * @return
	 */
	public LoginPage enterUsername(String username) {
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);
		return this;// return this return content to that page values
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.xpath("//button[@class=\"button is-primary\"]")).click();
		return new HomePage(driver);
	}

	public void ForgotPassword() {

	}

	/**
	 * To login without testing cases for login condition
	 * 
	 * @param username
	 * @param password
	 */
	public void Login(String username, String password) {
		enterUsername(username);
		enterPassword(password);

	}

}
