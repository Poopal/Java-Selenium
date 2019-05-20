package Introduction.IntroductionSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		//print the links on footer page
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		for (int i=1;1<columndriver.findElements(By.tagName("a")).size();i++)
			
		{
			
			String clickOnLink= Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
	   while(it.hasNext())
	   
	   {
	    
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
					
		}
	}

}
	
}
