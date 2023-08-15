package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions t=new ChromeOptions();
		t.addArguments("--disable-notifications");
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver(t);
		  driver.get("https://www.redbus.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
