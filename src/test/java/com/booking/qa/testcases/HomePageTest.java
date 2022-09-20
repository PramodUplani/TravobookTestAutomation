package com.booking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.HomePage;
import com.booking.qa.pages.LoginPage;

public class HomePageTest  extends TestBase  {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	public HomePageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		loginPage  =new LoginPage();	
		
		//homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		homePage = loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));	
		
	}
	@Test (priority=3)
	public void VerifyHomepageTitleTest(){
		String homePageTitle = homePage.VerifyHomepageTitle();
		Assert.assertEquals(homePageTitle, "Flight Tickets Booking, Cheap Flights, Airtickets at Travolook", "Homepage Title not matched");
		System.out.println("Homepage VerifyHomepageTitleTest Test Passed...... Priority=3 ");
		
		
	}
	
	@Test (priority=2)
	
	public void HomePageLogoTest() {
		
		boolean flag=homePage.ValidateLogoHomepage();
		Assert.assertTrue(flag);
		System.out.println("Homepage HomePageLogoTest Test Passed...... Priority=2 ");
		System.out.println(flag);
		
		
	}
	
	@Test (priority=1)
	public void VerifyURLTest()
	{
		String URL= homePage.VerifyHomepageURL();
		
		System.out.println("Homepage VerifyURLTest Test Passed...... Priority=1 ");
		
		System.out.println(URL);
		
	}
	
	@AfterMethod
	
	public void teardown()
	
	{
		driver.quit();
	}	
	
}