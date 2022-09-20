package com.booking.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;

public class HomePage extends TestBase {
	
@FindBy(xpath=("//*[@id=\'myaccount\']"))
WebElement MyProfile;
@FindBy(xpath=("//*[@id=\"myNavbar\']/ul[1]/li[1]/a"))
WebElement Flights;
	
@FindBy(xpath=("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a"))
WebElement Offers;

@FindBy(xpath=("//*[@id=\'myNavbar\']/ul[1]/li[3]/a"))
WebElement CancelorRescheduling;

@FindBy(xpath=("//*[@id=\"myNavbar\"]/ul[1]/li[4]/a"))
WebElement MakePayment;

@FindBy(xpath=("/html/body/div[1]/header/div/nav/div/div[1]/a/img"))
WebElement HomePageLogo;


public HomePage() {
	
	
	PageFactory.initElements(driver, this );
}



public String VerifyHomepageURL()


{
	return driver.getCurrentUrl();
}

public String VerifyHomepageTitle() 

{
	
	return driver.getTitle();
	
}


	public boolean ValidateLogoHomepage()
	{
		return HomePageLogo.isDisplayed();
	}

	
}
		
			
	/*
	
	
    String title=driver.getTitle();
    
    
    
   boolean logo= driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div[1]/a/img")).isDisplayed();
    
   
   if(logo=true)
   {
	System.out.println("Logo is Displaying on My Profile Page  after login............");
   }
   else 
   {
	   System.out.println("Logo is not Displaying after login....");
   }
   
   //System.out.println(logo);
   
   System.out.println("HomePage Title ------>>>>> " +title);
  // Thread.sleep(5000);
   
   //Thread.sleep(10000);
   
   driver.findElement(By.xpath("//*[@id=\"myaccount\"]")).click();
   driver.findElement(By.xpath("//*[@id=\"logindata\"]/ul/li[1]/a")).click();
   
   String t = "My Bookings Details ";
   // getPageSource() to get page source
   if ( driver.getPageSource().contains("My Bookings Details ")){
      System.out.println("Text: " + t + " are present. ");
   } else {
      System.out.println("Text: " + t + " are not present. ");
   }
   
   
	}

}*/
