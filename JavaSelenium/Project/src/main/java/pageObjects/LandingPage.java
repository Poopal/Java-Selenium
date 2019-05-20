package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	By signin= By.cssSelector("a[href='http://qaclickacademy.usefedora.com/sign_in']");
	By title= By.xpath("//*[@id=\"content\"]/div/div/h2");
	By NavBar = By.linkText("contact.php");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}

}
