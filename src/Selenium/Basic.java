package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.google.com");
		  String c=driver.getTitle();
		  System.out.println(c);
		String a = driver.getCurrentUrl();
		System.out.println(a);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("http://www.fb.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		String s=driver.getTitle(); 
		System.out.println(s);
		String b=driver.getCurrentUrl() ;
		System.out.println(b);
		
driver.close();
	}

}
