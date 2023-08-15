package Datdrivenfreamwrk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Loginexample {
	String[][] data= {{"Admin","admin123"},
				          {"Admin","admin"},
				          {"dummy","admin123"},
				          {"dummy","admin123"}};
		
		
		
		
		
	
	
	@DataProvider(name="logindata")
	public String[][] usingdataprovider() {
		return data;
	}
	
	@Test(dataProvider="logindata")
	
	public void loginwithbothCorrect(String uname,String pword) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath(
				"//input[@name='username'][@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys( pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();

		
	}

}
