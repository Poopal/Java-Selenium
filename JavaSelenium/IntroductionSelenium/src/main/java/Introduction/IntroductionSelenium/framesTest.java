package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.findElement(By.className("demo-frame")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		Actions a= new Actions(driver);
		//driver.findElement(findElement(By.id("droppable"))).click();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		
		
	}

	private static By findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
