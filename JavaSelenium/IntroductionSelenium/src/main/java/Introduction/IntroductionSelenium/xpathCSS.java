package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Sandesh");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Poonam");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();;
		
	}

}
