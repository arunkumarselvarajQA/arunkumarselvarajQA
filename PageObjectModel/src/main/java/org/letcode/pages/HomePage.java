package org.letcode.pages;

import org.letcode.SeleniumBase.LetCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HomePage extends LetCodeBase {

	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	@Test
	public String getHometitle() {
		WebElement Homepagetilecheck= driver.findElement(By.xpath("//h1[text()=' LetCode with Koushik']"));
	//	Homepagetilecheck.getText();
		System.out.println(Homepagetilecheck);
		return Homepagetilecheck.getText();
	}
}
