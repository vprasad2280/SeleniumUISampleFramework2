package com.mystore.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import  org.testng.annotations.*;
public class baseClass {

	static String baseURL="https://demo.midtrans.com/";
	String userNasme="";
	String passWord="";
	public static WebDriver driver;

	@BeforeClass

	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		

	}

	@AfterClass

	public void teardown()
	{
		driver.close();

	}
}
