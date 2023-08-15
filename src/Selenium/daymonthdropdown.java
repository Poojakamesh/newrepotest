package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class daymonthdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select [contains(@name,'DOB')]
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  WebElement g=driver.findElement(By.xpath("//select [contains(@name,'DOB')]"));
		  
		  Select s=new Select(g);
		  s.selectByIndex(5);
		  
		  List<WebElement> r=s.getOptions();
		  
		  int o=r.size();
		  System.out.println(o);
		  for(int i=0;i<=o-1;i++) {
			  String k=r.get(i).getText();
			  System.out.println(k);
		  }
		  System.out.println("-----------month--------------");
		  WebElement l=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		  Select v=new Select(l);
		  v.selectByVisibleText("MAR");
		
   List<WebElement> u=v.getOptions();
		  
		  int e=u.size();
		  System.out.println(e);
		  for(int i=0;i<=e-1;i++) {
			  String k=u.get(i).getText();
			  System.out.println(k);
		  }
		  System.out.println("year");
		  WebElement h=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		  Select w=new Select(h);
		  w.selectByValue("2000");
		 List<WebElement> y= w.getOptions();
		 int b=y.size();
		 System.out.println(y);
		 
		 for(int i=0;i<=b-1;i++) {
			 String z=y.get(i).getText();
			 System.out.println(z); 
		 }
	}

}
