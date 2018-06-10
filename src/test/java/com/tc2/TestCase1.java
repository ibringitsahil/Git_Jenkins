package com.tc2;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	public static WebDriver driver;
    @BeforeClass
	public void LoadBrowser() throws IOException {
		String url = "http://automationpractice.com/index.php";

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver (2).exe");
		driver = new ChromeDriver();

		driver.get(url);

	}
    @Test
    public void firstTest(){
//    	Test
    }
}
