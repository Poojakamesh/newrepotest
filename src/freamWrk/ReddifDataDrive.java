package freamWrk;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ReddifDataDrive {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("weddriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	

	
	 
	
	  @Test(dataProvider = "v") public void Verifytest(String user, String pass)
	  throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id=\"login1\"]")).clear();
	  
	  driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys(user);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
	  //driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
	  Thread.sleep(1000); }
	 

	@AfterTest
	public void TerDown() {
		driver.close();
	}

	@DataProvider(name = "v")
	public Object[][] getData() {
		
		  Object[][] ob=new Object[7][2];
		  
		  ob[0][0]="amazon"; 
		  ob[0][1]="amaon123";
		  
		  
		  ob[1][0]="tcs";
		  ob[1][1]="tcs123";
		  
		  ob[2][0]="flipcart"; 
		  ob[2][1]="flipcart123";
		  
		  ob[3][0]="infosys";
		  ob[3][1]="infosy123";
		  
		  ob[4][0]="ibm"; 
		  ob[4][1]="ibm123";
		  
		  ob[5][0]="google"; 
		  ob[5][1]="google123"; 
		  
		  ob[6][0]="microsoft";
		  ob[6][1]="microsoft123";
		  
		  
		  return ob;
	}
		

	}

