package programPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frmeexmple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://mail.rediff.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		List<WebElement> v=  driver.findElements(By.tagName("iframe"));
		System.out.println(v.size());
		int l=v.size();
		
		for(int i=0;i<l;i++)
		{
			String s=v.get(i).getText();
			System.out.println(s);
		}
		for(WebElement gg:v) {
			String b=gg.getAttribute("id");
		}
	}
}