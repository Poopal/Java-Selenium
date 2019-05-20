package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceExplicitWait {

	private static final String text = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		WebDriverWait d= new WebDriverWait(driver,7);
		d.until(ExpectedConditions.textToBePresentInElementLocated(By.id("results"), null));
		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
