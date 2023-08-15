package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.amazon.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  List<WebElement> b= driver.findElements(By.tagName("a"));
		  int s=b.size();
		  System.out.println(s);
		  for(int i=0;i<=s-1;i++) {
			  String j=b.get(i).getText();
			 System.out.println(j);
		  }
			  for(WebElement cc:b) {
				  System.out.println(cc.getText()+"--------------------------->"+cc.getAttribute("href"));
				  
			  }
		  }

	}


