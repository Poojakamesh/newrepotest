package Selenium;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alterpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions t=new ChromeOptions();
		t.addArguments("--disble-noification");
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver(t);
		  driver.get("https://www.tnstc.in/home.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//div[@class='btnTxt']")).click();
		  Alert w=driver.switchTo().alert();
		  
		  String k=w.getText();
		  System.out.println(k);
		  
		  Thread.sleep(2000);
		 w.dismiss();
		  
		  
	}

}
