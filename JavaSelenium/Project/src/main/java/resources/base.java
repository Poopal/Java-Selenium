package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public WebDriver initialisebrowser() throws IOException
	
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\sony\\Project\\src\\main\\java\\resources\\data.properties");
				
		prop.load(fis);
		String browserName=prop.getProperty("browser");
				
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			//firefox Browser
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
			//IE Browser
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenshot()
	{
		((TakesScreenshot)driver.getScreenshot(OutputType.FILE);
	}
}
