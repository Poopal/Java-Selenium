package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.facebook.com");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.close();// it closes current browser
		driver.quit();//it closes all browser opened by script*/
		driver.findElement(By.id("email")).sendKeys("2905poonam@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Club@123456789");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}
}
