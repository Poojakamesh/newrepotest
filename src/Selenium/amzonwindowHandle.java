  package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amzonwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  String parent=driver.getWindowHandle();
		  driver.findElement(By.xpath("//span[contains(text(),'sign')]")).click();
		  
		// element clicking
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8148802625");
	
	driver.findElement(By.xpath("//input[starts-with(@id,'continue')]")).click();
	driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("poojakamesh");
	driver.findElement(By.xpath("//input[starts-with(@id,'signInSubmit')]")).click();
	driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtext')]")).sendKeys("iphone+14");
	driver.findElement(By.xpath("//input[starts-with(@id,'nav-search')]")).click();
	// scroll down
	JavascriptExecutor b=(JavascriptExecutor)driver; 
	 b.executeScript("window.scrollBy(0,1500)");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal') and contains(text(),'Apple iPhone 14 (128 GB) - Yellow')]")).click();
	
	 //driver.findElement(By.xpath("(//span[starts-with(text(),'Apple iPhone 14 (256 GB) - Yellow')])[1]")).click();
	//its going to second page
	
		Set<String> h= driver.getWindowHandles();
		
		
		for(String n:h) {// used Iterator new window getting
		driver.switchTo().window(n);//Switching to new window 
		if(!parent.equals(n)) { //if its not parent window u can perform under the code
			
			driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
			driver.get("https://www.amazon.in/cart?ref_=sw_gtc");	//getting cart
			//inside cart drop down list selected
			driver.findElement(By.xpath("//span[contains(@data-action,'a-dropdown-button')][1]")).click(); //count increse drop down
			List<WebElement> g=driver.findElements(By.xpath("//a[@class='a-dropdown-link']"));//selection drop down list
			System.out.println("size of the element"+g.size()) ;
			
			Thread.sleep(1000);
			
			for(int i=0;i<g.size();i++) {
				//System.out.println(g.get(i).getText());
				if(g.get(i).getText().contains("5")) { //contins equals mean
					g.get(i).click();
					Thread.sleep(1000);
					break;
					
				}
				
			}
			
			
			
			
			Thread.sleep(1000);

			
			 
			//.openqa.selenium.ElementClickInterceptedException
			//int num= driver.getWindowHandles().size();
			//System.out.println("number of window open"+num);
		}
		
		}
		driver.close();
		driver.switchTo().window(parent);
		
		 WebElement j= driver.findElement(By.xpath("//span[contains(text(),'Hello, POOJA')]"));
			 Actions n=new Actions(driver); //mouse over operation
			  n.moveToElement(j).perform();
		  driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		driver.navigate().back();
		 
}
	
	
	

		  
		  
	}


