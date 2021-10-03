package com.letcodeframework.in;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.letcodepages.in.Locators;



public interface BrowserMethods {

	RemoteWebDriver startApp(String browser, String url);
	
}
