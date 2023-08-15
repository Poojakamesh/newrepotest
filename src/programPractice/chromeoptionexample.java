package programPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chromeoptionexample {
	
	
	public static void main(String[] args) {
		ChromeOptions chrom=new ChromeOptions();
		 chrom.addArguments("--start-maximzed");
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
 
		 //chrom.addArguments("--start-maximized");
		 chrom.addArguments("--headless");
 WebDriver driver=new ChromeDriver(chrom);
 driver.get("https://www.tnstc.in/home.html");
 String c=driver.getTitle();
 System.out.println(c);
 String d=driver.getCurrentUrl();
 System.out.println(d);

	}

}
