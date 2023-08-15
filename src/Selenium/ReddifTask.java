package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("pooja");
		  driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("kamesh");
		  //driver.findElement(By.xpath("//input[starts-with(@class,'btn_checkavail')]")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[starts-with(@type,'password') and starts-with(@name,'passwd')]")).sendKeys("123qwe");
          driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("123qwe");
          driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("apooja@gamil.com");
          driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]")).sendKeys("8148802506");
      String g= driver.findElement(By.xpath("//td[contains(text(),'Create a Rediffmail account')]")).getText();
      System.out.println(g);
      String v  = driver.findElement(By.xpath("//td[starts-with(text(),'Create a ')]")).getText();
      System.out.println(v);
      String r = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
      System.out.println(r);
      
	}

}
