package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2905p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com");

		// how to navigate back
		driver.navigate().back();

		// how to navigate forward
		driver.navigate().forward();

		// how to refresh web browser
		driver.navigate().refresh();

		// how to get title of webPage

		System.out.println(driver.getTitle());

		// how to get existing URL from browser window

		String str = driver.getCurrentUrl();
		System.out.println(str);

		// how to get cookies from browser

		System.out.println(driver.manage().getCookies());

	}

}
