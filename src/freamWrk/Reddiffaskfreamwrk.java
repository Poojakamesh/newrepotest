package freamWrk;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiffaskfreamwrk {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test(priority=1)
	public void verifyTitle() {
		String v=driver.getTitle();
		Assert.assertEquals(v,"Rediffmail");
		System.out.println(v);
	}
	@Test(priority=2)
	public void verifyUrl() {
		String c=driver.getCurrentUrl();
		Assert.assertEquals(c,"https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(c);
	}
	@Test(priority=3)
	public void verifyName() {
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("pooja");
		
	}
	
	@Test(priority=5)
	public void verifyPassword() {
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("pooja123");
		
	}

	@Test(priority=6)
	public void verifyScreenshort() throws IOException {
		
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File store=new File("C:\\Users\\ADMIN\\Desktop\\screensh\\img.jpg");
		FileHandler.copy(file, store);
		}
	@Test(priority=7)
	public void verifyScrollupDown() throws InterruptedException {
		JavascriptExecutor dropdown=(JavascriptExecutor)driver;
		
		dropdown.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		dropdown.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
	}
	@Test(priority=4)
	public void verifypopup() throws InterruptedException {
		driver.findElement(By.xpath("//input[contains(@value,'Sign in')]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		
		System.out.println(s);
		Thread.sleep(2000);
		a.accept();
	}
	@Test(priority=8)
	public void verifyTagName() {
	List<WebElement> allLink=driver.findElements(By.tagName("a"));
	int s=allLink.size();
	System.out.println("all the link"+s);
	for(int i=0;i<=s-1;i++) {
		String h=allLink.get(i).getText();
		System.out.println(h);
	}
		for(WebElement ll:allLink) {
			String j=ll.getAttribute("href");
			System.out.println(j);
	}
	}
	@Test(priority=9)
	public void verifyfreame() {
		List<WebElement> totalframe=driver.findElements(By.tagName("iframe"));
		driver.switchTo().defaultContent();
		int fs=totalframe.size();
		System.out.println("all the freame"+fs);
		for(int i=0;i<=fs-1;i++) {
			String u=totalframe.get(i).getText();
			System.out.println(u);
			
	}
		for(WebElement gg:totalframe) {
			String j=gg.getAttribute("id");
			
		//Assert.assertEquals(j,"google_ads_iframe_/42115163,21677187305/IP_mail.rediff.com_Desk_300x250_ALL_ATF_0");
			System.out.println(gg);
			 
			}
	}
		@Test(priority=10)
		public void verifygetest() {
			WebElement k=driver.findElement(By.xpath("//u[.='Forgot Password?']"));
			System.out.println(k.getText());
			
		}
	
	
		
	
	

	}
	
	


