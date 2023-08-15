package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class scrolldownup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.rediff.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement e =driver.findElement(By.xpath("//a[contains(.,'Sign in')]"));
		 JavascriptExecutor b=(JavascriptExecutor)driver; // typecasting
		
		b.executeScript("window.scrollBy(0,5500)");
		 //Actions a=new Actions(driver);
		// a.keyDown(Keys.CONTROL);
		 Thread.sleep(2000);
		// b.executeScript("window.scrollBy(0,-5500)");
		Thread.sleep(2000);
	}

}
