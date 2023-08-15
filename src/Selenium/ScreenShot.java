package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//File file=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileHandler.copy(file, new File("C:\\Users\\ADMIN\\Desktop\\screensh\\pooj1.jpg"));
 // another way
		 
	File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File store=new File("C:\\Users\\ADMIN\\eclipse-workspace\\kamesh\\src\\Selenium\\pooja\\img.png");
	FileHandler.copy(file, store);
	}
}

	


