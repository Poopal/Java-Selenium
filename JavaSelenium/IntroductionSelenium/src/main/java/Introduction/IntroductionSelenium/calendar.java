package Introduction.IntroductionSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.name("travel_date")).click();
		List<WebElement> dates = driver.findElements(By.className("days"));
		
		
		int count = driver.findElements(By.className("days")).size();
		for (int i=0; i<count;i++)
			
		{
				
			String text= driver.findElements(By.className("days")).get(i).getText();
			if(text.equalsIgnoreCase("20"))
				
			{
				driver.findElements(By.className("days")).get(i).click();
				break;
			}
		}
	}
	

}
