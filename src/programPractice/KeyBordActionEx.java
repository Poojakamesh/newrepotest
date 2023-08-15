package programPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordActionEx {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chromedriver.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1).chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Actions a=new Actions(driver);
	driver.findElement(By.name("firstname")).sendKeys("pooja");
	a.sendKeys(Keys.TAB)// going to next text box using tab
	.pause(Duration.ofSeconds(1))
	.sendKeys("kamesh").build().perform();
	
					
	
	}

}
