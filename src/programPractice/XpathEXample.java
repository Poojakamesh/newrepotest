package programPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  //driver.findElement(By.xpath("//input[@name='login803142f8']")).sendKeys("pooja");
		 // driver.findElement(By.xpath("driver.findElement(By.xpath("//td[@valign='bottom']/input")).sendKeys("pooja");

	}

}
