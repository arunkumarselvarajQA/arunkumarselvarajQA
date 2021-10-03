package com.letcode.projectsepecified.in;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.letcode.seleniumBase.in.SeleniumBaseMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecifiedMethods extends SeleniumBaseMethods{
	public String Excelname;// declared globally to pass dynamically
	public String Sheetname;
	
	

	@BeforeMethod

	public void beforeMethod() {
		driver = startApp("chrome", "https://letcode.in/signin");
	//	node = test.createNode(testCaseName);
	}
	@DataProvider(name = "Data")
	public Object[][] dataProvider() throws IOException {
		Object[][] excelobj=utlis.DataLibrary.getExcelData(Excelname, Sheetname);
		return excelobj;
	}
}