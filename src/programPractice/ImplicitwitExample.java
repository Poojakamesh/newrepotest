package programPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitwitExample {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
       driver=new FirefoxDriver();
       visiblitywait();
	}
		
	
	
	
public static void  visiblitywait() {
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
WebElement v=	 driver.findElement(By.cssSelector("[alt='Electronics']"));
Actions a=new Actions(driver);
a.moveToElement(v).perform();
WebElement w=driver.findElement(By.linkText("Gaming"));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOf(w));
w.click();
wait.until(ExpectedConditions.titleContains("Buy Gaming"));
System.out.println(driver.getTitle());
}
//[alt='Electronics']
	
	
	
	public void alertwait() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("[type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert u=wait.until(ExpectedConditions.alertIsPresent());
		//u.accept();
        driver.switchTo().alert().accept();

	}
	
}
