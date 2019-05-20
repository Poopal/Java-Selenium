package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateNavigationBar extends base{
	
	@Test

	public void basePageNavigation() throws IOException
	
	{
		driver= initialisebrowser();
		driver.get("https://qaclickacademy.com");
		
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    
	
		
		
	}
	

}

