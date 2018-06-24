package com.tc2;
import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	public static WebDriver driver;
    @BeforeClass
	public void LoadBrowser() throws IOException {
		String url = "http://www.seleniumframework.com/Practiceform/";

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\geckodriver (2).exe");
		driver = new FirefoxDriver();

		driver.get(url);
		
		driver.manage().window().maximize();

	}
    @Test
    public void TC1_DragAndDrop() throws InterruptedException{
    	try{
    	Assert.assertEquals(driver.getTitle(), "Selenium Framework |   Practiceform1");
    	System.out.println("Successfull");
    }catch (Exception e) {
    	System.out.println("Fail");
    	Assert.fail();
    }
		
	}
}
