package Introduction.IntroductionSelenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.findElement(By.xpath("/html/body/footer/section/ul[2]/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids= driver.getWindowHandles();
		java.util.Iterator<String> it= ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
	}

}
