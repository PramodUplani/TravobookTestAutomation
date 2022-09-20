package com.booking.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.FlightsBookingPage;
import com.booking.qa.pages.HomePage;
import com.booking.qa.pages.LoginPage;

public class FlightsBookingTest	extends TestBase{
		
		//FlightBookingPage flightbookingPage;
	
	
LoginPage loginPage;
	
	HomePage homePage;
	
	FlightsBookingPage flightsBookingPage;
		
	    public FlightsBookingTest() {
			
			super();
		}
	    
	    @BeforeMethod
		public void setup() {
			
	    	initilization();
			//flightbookingPage = new FlightBookingPage();
	    	//homePage = loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		}
	    
	    @Test(priority = 1)
	    public void clickFlightTest() {
	    	
	    	//homePage = loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
	    	
	    	//flightbookingPage.clickFlightLink();
	    }
	    
	    @Test(priority = 2)
	    public void searchFlightTest() throws InterruptedException {
	    	//homePage = loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
	    	flightsBookingPage.searchFlight();
	    	
	    	
	    }
	    
	    @AfterMethod
		public void tearDown() {
			
			driver.quit();
		}

	}
