package com.il.mo.co.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;




public abstract class AbstractTestCase {

	protected WebDriver driver;
	protected WebDriverWait wait;


	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://codef0rmer.github.io/angular-dragdrop/#!/");
		
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}