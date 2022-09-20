package com.booking.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;



public class OneWayTripPage extends TestBase {
	
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
	
	
	public OneWayTripPage() {
		
		
		PageFactory.initElements(driver, this );
	}

public void SearchForFlights () throws InterruptedException {
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
	
	
}}}

/*

For
{
String text2=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td")).getText();




if (text2.equals(day))
{
System.out.println("Departure Date is   "  +text2+ "  ");
break;
}

else
{
	Thread.sleep(2000);
	//System.out.println(text);
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click(); 
	
	
}
*/
/*

List<WebElement> ddate= driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));

for(WebElement ele:ddate)
{
String datetext=ele.getText();



if (datetext.equals(day))
	
{
	
	ele.click();
	//System.out.println("Departure Date is  " +datetext+ " " +text);
	break;
}

}
//System.out.println("Departure Date is  " +datetext+ "  " +text+);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"travel_id\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sub1plus\"]")).click();
driver.findElement(By.xpath("//*[@id=\"sub1plus\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sub2plus\"]")).click();
driver.findElement(By.xpath("//*[@id=\"sub2plus\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"sub3plus\"]")).click();

driver.findElement(By.xpath("/html/body/div[1]/form/section/div/div/div[2]/div[6]/span[4]/a")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"searchengine_btn\"]")).click();



List<WebElement> list3=driver.findElements(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/div"));
System.out.println("Available flights Are....."+list3.size());
for (WebElement e : list3) {
// String name = webElement.getText();
System.out.println(e.getText());
// System.out.println(bakeries.size());
Thread.sleep(11000);

driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/div[1]/div[2]/button")).click();
*/

 /*
 public HomePage login(String lei, String pwd )
	{
		LoginOrSignUp.click();
		LoginEmail.sendKeys(lei);
		Password.sendKeys(pwd);
		SignInbtn.click();
		
		return new HomePage();	
		
	}
	*/
	
	public String VerifyHomepageURL()
	{
		return driver.getCurrentUrl();
	}

	public String VerifyHomepageTitle() {
		
		return driver.getTitle();
		
	}
}
/*
		public boolean ValidateLogoHomepage()
		{
			return HomePageLogo.isDisplayed();
		}

		
	}

*/