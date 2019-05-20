package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@Test
	public void WEbLoginCarLoan()
	{
		System.out.println("Web Login Car");
	}

	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("Mobile Login Car");
	}
	
	@BeforeTest
	public void APILoginCarLoan()
	{
		System.out.println("API Login Car");
	}
	
}
