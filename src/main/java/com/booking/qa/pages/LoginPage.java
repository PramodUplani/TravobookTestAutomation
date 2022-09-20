package com.booking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	
	// Object Reposatory OR Page Factory 
	
	@FindBy(id="login_top1")
	WebElement LoginOrSignUp;
	
	
	@FindBy(id="txtloginemail")
	WebElement LoginEmail;
	
	@FindBy(id="txtloginpassword")
	WebElement Password;
	
	////*[@id="login"]/input[4]
	
	@FindBy(xpath="//*[@id='login']/input[4]")
	WebElement SignInbtn;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/div[1]/a/img")
	WebElement travolookLogo;
	
	// Initializing the page Object 
	
	public LoginPage() {
		
		
		PageFactory.initElements(driver, this );
		
			
	}
	
	//Actions 
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}

	public boolean ValidateLogo()
	{
		return travolookLogo.isDisplayed();
	}

	public HomePage login(String lei, String pwd )
	{
		LoginOrSignUp.click();
		LoginEmail.sendKeys(lei);
		Password.sendKeys(pwd);
		SignInbtn.click();
		
		return new HomePage();	
		
	}
	
	
}
