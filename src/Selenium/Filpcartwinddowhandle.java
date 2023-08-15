package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpcartwinddowhandle {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 String parentwindow=driver.getWindowHandle();//saving pren window one string
		
		//mouseover
		/*
		 * WebElement ele= driver.findElement(By.xpath("//a[text()='Login']"));
		 * ele.click(); //Actions action=new Actions(driver);
		 * 
		 * //action.moveToElement(ele).perform(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.
		 * xpath("//button[contains(text(),'Request OTP')]//preceding::input[1]")).
		 * sendKeys("8148802625");
		 */
		 
		 driver.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
		 
		 driver.findElement(By.name("q")).sendKeys("moblie");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//div[contains(text(),'POCO C51 (Royal Blue, 64 GB)')]")).click();
		Set<String> s= driver.getWindowHandles();
		for(String h:s) {
			 driver.switchTo().window(h);
			if(!parentwindow.equals(h)) {
				
				driver.findElement(By.xpath("//button[@type='button']//preceding::button[1]")).click();
				driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
			}
		
		 
		}

		driver.close();
		driver.switchTo().window(parentwindow);
		// driver.findElement(By.name("q")).clear();
}
}