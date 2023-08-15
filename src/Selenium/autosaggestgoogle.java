package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class autosaggestgoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.co.in");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("webdriver");
		  
		 /* List<WebElement> j=driver.findElements(By.xpath("//div[@class='mkHrUc']/div[1]/div/ul/li[7]"));
		  for(WebElement aa:j) {
			  if(aa.getText().equals("webdriver manager")) {
				  aa.click();
			  }
			  
		  }*/
		  
		  List<WebElement> j=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		  System.out.println(j.size());
		  Thread.sleep(3000);
		for (WebElement webElement : j) {
			if(webElement.getText().equals("webdriver manager")) {
				webElement.click();
				break;
			}
			
		}
		driver.close();
	}

}
