package com.booking.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;

//import com.booking.qa.testcases.flightSelectionPage;

public class FlightsBookingPage extends TestBase {
	
	public String month="October 2022";
	public String day="11";
	//@FindBy 
	//By.xpath("//*[@id=\"login_top1\"]"
	@FindBy(xpath=("//*[@id='flying_from_N']"))
	WebElement FromCity;
	
	@FindBy(xpath=("//*[@id='flying_to_N']"))
	WebElement ToCity;
	
	
	@FindBy (xpath=("//*[@id='Fly_depdate_val']"))
	WebElement DepartureDate;
	
	@FindBy (xpath=("//*[@id='ui-datepicker-div']/div[2]/div/a/span"))
	WebElement NextBtn;
	
	@FindBy(xpath=("//*[@id='ui-datepicker-div']/div[1]/div/div"))
	WebElement MonthYear;
	
	
	
	

public FlightsBookingPage() {
	
	PageFactory.initElements(driver, this);

}



public void searchFlight() throws InterruptedException {
	 FromCity.click();
		//From.sendKeys("Pune");
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.DOWN).perform();
		act1.sendKeys(Keys.DOWN).perform();
		act1.sendKeys(Keys.DOWN).perform();
		act1.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(8000);
	
ToCity.click();
//To.sendKeys("Delhi");

Actions act2 = new Actions(driver);
act2.sendKeys(Keys.DOWN).perform();
act2.sendKeys(Keys.ENTER).perform();


//iver.findElement(By.xpath("//*[@id=\"Fly_depdate_val\"]")).click();

DepartureDate.click();

Thread.sleep(5000);


//String text=driver.findElement(By.xpath("//*[@class='month2']")).getText();
//	System.out.println(text);
Thread.sleep(5000);
//driver.quit();



while(true)
{
//ring text=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();

String text= MonthYear.getText();
if (text.equals(month))
{
System.out.println("Departure Date is   "  +text);
break;
}

else
{
	Thread.sleep(2000);
//	System.out.println(text);
	NextBtn.click();
	
	
	// return new flightSelectionPage();
}}
}}
