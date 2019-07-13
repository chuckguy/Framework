package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	//This is a new commit to test GIT
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	//Using page factory
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	public void loginToCRM(String usernameApplication,String passwordApplication)
	{
		//Sleep 2 seconds to see what happens.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
