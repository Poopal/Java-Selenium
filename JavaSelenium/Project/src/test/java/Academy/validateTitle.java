package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base{
	
	@Test(dataProvider="getData")

	public void basePageNavigation(String Username, String password, String text) throws IOException
	
	{
		driver= initialisebrowser();
		driver.get("https://qaclickacademy.com");
		
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	   
	
		
		
	}
	
	

}

