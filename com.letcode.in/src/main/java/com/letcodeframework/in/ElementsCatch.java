package com.letcodeframework.in;

import java.net.MalformedURLException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.letcodepages.in.Locators;



public interface ElementsCatch {
	
	/**
	 * This method will click the element and take snap
	 * @param ele   - The Webelement (button/link/element) to be clicked
	 * @see locateElement method in Browser Class
	 * @author Sarath - TestLeaf
	 * @throws StaleElementReferenceException
	 */
	public void click(WebElement ele);
	
	
	/**
	 * This method will enter the value in the given text field 
	 * @param ele   - The Webelement (text field) in which the data to be entered
	 * @param data  - The data to be sent to the webelement
	 * @see locateElement method in Browser Class
	 * @author Sarath - TestLeaf
	 * @throws ElementNotInteractable,IllegalArgumentException(throws if keysToSend is null)	
	 */
	public void append(WebElement ele, String data);
	 void clearAndType(WebElement ele,String data);


	WebElement locateElement(Locators locatorType, String value);
}
