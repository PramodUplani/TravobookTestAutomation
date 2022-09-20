package com.booking.qa.testcases;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.HomePage;
import com.booking.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	public LoginPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		loginPage  =new LoginPage();	
	} 
	
	@Test (priority=1)
	public void LoginPageTitleTest()
	
	{
		String title=loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Flight Tickets Booking, Cheap Flights, Airtickets at Travolook");
		System.out.println("Login Page PageTitle Test Passed...... priority=1 ");
	}
	@Test (priority=2)
	public void travolookLogoImageTest()
	{
		boolean flag=loginPage.ValidateLogo();
		Assert.assertTrue(flag);
		System.out.println("Login Page travolookLogoImageTest Test Passed...... priority=2 ");
		
	}
	
	@Test (priority=3)
	public void LoginTest(){
		
		homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		System.out.println("Login Page LoginTest Test Passed...... priority=3 ");
		
		//loginPage.login(null, null)
		//loginPage.login(prop.getProperty(LoginEmail), prop.getProperty(password));

		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	
	
}
