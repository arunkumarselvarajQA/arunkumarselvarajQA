package com.letcode.seleniumBase.in;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.letcodeframework.in.BrowserMethods;
import com.letcodeframework.in.ElementsCatch;
import com.letcodepages.in.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseMethods implements BrowserMethods, ElementsCatch {
	public RemoteWebDriver driver;
	public WebDriverWait wait;

	protected Actions act;

	@Override
	public void click(WebElement ele) {
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			// text = ele.getText();
			ele.click();

		} catch (StaleElementReferenceException e) {

			throw new RuntimeException();
		}
	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub

	}

	@Override

	public RemoteWebDriver startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized"); 
				options.addArguments("--disable-notifications"); 
				options.addArguments("--incognito");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// reportStep("The Browser Could not be Launched. Hence Failed", "fail");
			throw new RuntimeException();
		}
		return driver;

	}

	@Override
	public WebElement locateElement(Locators locatorType, String value) {
		try {
			switch (locatorType) {
			case CLASS_NAME:
				return driver.findElement(By.className(value));
			case CSS:
				return driver.findElement(By.cssSelector(value));
			case ID:
				return driver.findElement(By.id(value));
			case LINK_TEXT:
				return driver.findElement(By.linkText(value));
			case NAME:
				return driver.findElement(By.name(value));
			case PARTIAL_LINKTEXT:
				return driver.findElement(By.partialLinkText(value));
			case TAGNAME:
				return driver.findElement(By.tagName(value));
			case XPATH:
				return driver.findElement(By.xpath(value));
			default:
				System.err.println("Locator is not Valid");
				break;
			}
		} catch (NoSuchElementException e) {
			// reportStep("The Element with locator:" + locatorType + " Not Found with
			// value: " + value + "\n"
			// + e.getMessage(), "fail");
		} catch (Exception e) {
			// reportStep("The Element with locator:" + locatorType + " Not Found with
			// value: " + value + "\n"
			// + e.getMessage(), "fail");
		}
		return null;
	}

	@Override
	public void clearAndType(WebElement ele, String StoreData) {
		try {
			ele.clear();
			ele.sendKeys(StoreData);
			// reportStep("The Data :"+data+" entered Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			// reportStep("The Element "+ele+" is not Interactable", "fail");
			throw new RuntimeException();
		}

	}

}
