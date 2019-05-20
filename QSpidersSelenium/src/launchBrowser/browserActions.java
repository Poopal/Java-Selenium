package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2905p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //To load Web page
        driver.get("https://www.flipkart.com/");
        
        //To close browser
        driver.close();
        
        //To load URL
        driver.navigate().to("https://www.google.com");
        
        //To maximize browser
        driver.manage().window().maximize();
        
        //To close all multiple browser instance which are opened in current session
        driver.quit();
        
        
        
        
	}

}
