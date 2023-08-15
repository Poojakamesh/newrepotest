package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocaterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.linkText("Sign Up")).click();
		  //driver.findElement(By.name("firstname")).click();
		  driver.findElement(By.name("firstname")).sendKeys("pooja");
		 // driver.findElement(By.name("lastname")).click();
		  driver.findElement(By.name("lastname")).sendKeys("kamesh");
		 // driver.findElement(By.id("u_0_d_nO")).sendKeys("anand");
		//  driver.findElement(By.name("reg_email__")).click();
		  driver.findElement(By.name("reg_email__")).sendKeys("apooja311@gmail.com");
		// driver.findElement(By.name("reg_passwd__")).click();
		  driver.findElement(By.name("reg_passwd__")).sendKeys("kame123");
		  driver.findElement(By.partialLinkText("Policy")).click();
		 //driver.findElement(By.linkText("Privacy Policy")).click();
	}

}
