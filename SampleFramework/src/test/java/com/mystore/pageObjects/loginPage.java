package com.mystore.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	
	public loginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
		
	}
	
	@FindBy(xpath=".//a[@class='login']")
	WebElement SignInLink ;
	
	
	public void ClickSignInLink() {
		
		SignInLink.click();
	}

}
