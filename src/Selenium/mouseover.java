package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.naukri.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebElement w= driver.findElement(By.xpath("//div[text()='Companies']"));
		 Actions a=new Actions(driver);
		  a.moveToElement(w).perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Top companies']")).click();
		  
		  
		  
		  
	}

}
