package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	@Test(dataProvider="getData")

	public void basePageNavigation(String Username, String password, String text) throws IOException
	
	{
		driver= initialisebrowser();
		driver.get("https://qaclickacademy.com");
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys("email");
		lp.getpassword().sendKeys("password");
		System.out.println(text);
		lp.getlogin().click();
		
	}
	
@DataProvider

public Object[][] getData()
{
	Object[][] data = new Object[2][3];
	data[0][0]="2905poonam@gmail.com";
	data[0][1]="Rushmore@123";
	data[0][2]="Restricted User";
	
	data[1][0]="poonam@gmail.com";
	data[1][1]="123456";
	data[1][2]="Unrestricted User";
	
	return data;
}
	
}
