package org.fbpages;

import java.util.Properties;

import org.facebook.com.BaseConfigLingualLang;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FaceBookpages extends BaseConfigLingualLang {
	
	public FaceBookpages(RemoteWebDriver driver,Properties property) {
		this.driver = driver;
		prop=property;
	}
	public FaceBookpages enterFBname(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
		return this;// return this return content to that page values
	}public FaceBookpages enterFBpass(String pass) {
		driver.findElement(By.id("pass")).sendKeys(pass);
		return this;// return this return content to that page values
	}
	public FaceBookpages fbclick()  {
		driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
	//	Thread.sleep(5000);
		return this;// return this return content to that page values
	}
	public FaceBookpages forgot() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		return this;// return this return content to that page values
	}
}
