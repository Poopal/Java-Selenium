package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		/*driver.findElement(By.id("username")).sendKeys("Poonam");
		driver.findElement(By.id("password")).sendKeys("Sandesh");
		//driver.findElement(By.id("Login")).click();*/
		
		driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("Sandesh");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Poonam");
		driver.findElement(By.id("Login")).click();

		
		
		
		

	}

}
