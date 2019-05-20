package Introduction.IntroductionSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.name("FrAirport")).click();
		driver.findElement(By.name("FrAirport")).sendKeys("NYC");
		driver.findElement(By.name("FrAirport")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("FrAirport")).sendKeys(Keys.TAB);
		driver.findElement(By.id("FH-destination")).sendKeys("CAN");
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("FH-fromDate")).click();
		driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);
		
		//Explicit Wait
		
		WebDriverWait d=new WebDriverWait(driver,25);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.id("hotelNewSearchLnk")));
		
		
		
		
		
		
		
	}

}
