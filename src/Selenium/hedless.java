package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hedless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions r=new ChromeOptions();
		r.addArguments("--headless");
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver(r);
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  String c=driver.getTitle();
		  System.out.println(c);
		  String d=driver.getCurrentUrl();
		  System.out.println(d);
	}

}
