package programPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploaadFile {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
        WebDriver driver=new ChromeDriver();
        driver.get("Downloads");
       // driver.findElement("");
        
	}

}
