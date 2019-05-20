package Introduction.IntroductionSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).getText();
		
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		
		if(text.contains(opt))
		{
			System.out.println("Alert message sucess");
		}
		
		else
			
		{
			System.out.println("Sothing went wrong");
		}
	
		
	}


}
