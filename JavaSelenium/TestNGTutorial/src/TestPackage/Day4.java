package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@AfterTest
	public void WEbLoginCarLoan()
	{
		System.out.println("Web Login Car");
	}

	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("Mobile Login Car");
	}
	
	@Test
	public void APILoginCarLoan()
	{
		System.out.println("API Login Car");
	}
	
}
