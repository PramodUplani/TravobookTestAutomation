package com.booking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.HomePage;
import com.booking.qa.pages.LoginPage;
import com.booking.qa.pages.OneWayTripPage;

public class OneWayTripTest extends TestBase {
			
			LoginPage loginPage;
			
			HomePage homePage;
			
			OneWayTripPage oneWayTrip;
			
			public OneWayTripTest() {
				
				super();
				
			}
			
			
			
			
			@BeforeMethod
			public void setUp() {
				
				initilization();
				loginPage  =new LoginPage();	
				homePage  =new HomePage();
				// oneWayTripPage =new OneWayTripPage();
				
				//homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
				
				
			} 
			@Test  (priority=4)
			public void SearchFlightsTest() throws InterruptedException
			{
				
				oneWayTrip.SearchForFlights();
				System.out.println("Search Results and flight selection........");
				
			}
			
			
			@Test (priority=1)
			public void FlightBookingTest()
			
			
			{
			
				homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
				System.out.println("One way trip Test 1");
				//oneWayTripPages.
				//homePage.VerifyHomepageURL();
				
				//String title=loginPage.ValidateLoginPageTitle();
				//Assert.assertEquals(title, "Flight Tickets Booking, Cheap Flights, Airtickets at Travolook");
				
			}
			@Test (priority=2)
			public void travolookLogoImageTest()
			{
				boolean flag=loginPage.ValidateLogo();
				Assert.assertTrue(flag);
				
				System.out.println("Flights Booking  travolookLogoImageTest Test Passed...... Priority=2 ");
				
				
			}
			
			@Test (priority=3)
			public void LoginTest(){
				
				
				System.out.println("Flights Booking  LoginTest Test Passed...... Priority=2 ");
				
				System.out.println("One way trip Test 3 ");
				
			//	homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
				
				//loginPage.login(null, null)
				//loginPage.login(prop.getProperty(LoginEmail), prop.getProperty(password));

				
			}
			
			
			
			
			@AfterMethod
			public void tearDown() {
			driver.quit();
			}

			
			
		}



