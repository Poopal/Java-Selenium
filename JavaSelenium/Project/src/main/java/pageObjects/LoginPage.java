package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;

	By email= By.id("user_email");
	By password=By.name("user[password]");
	By login =By.xpath("//*[@value='Log In']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
}

