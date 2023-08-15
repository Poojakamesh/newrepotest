package programPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class freameexample {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 // WebElement w= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		 // Actions a=new Actions(driver);
		  //a.moveToElement(w).perform();
	//	 driver.findElement(By.className("[id='iFrame']")).click();
		  
		  //Switch to frame
		 driver.switchTo().frame(1);
		 driver.findElement(By.name("mytext2")).sendKeys("hi");
	//screen short	  
		 File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File store=new File("Selenium\\pooja1\\img2.jpg`");
		 FileHandler.copy(file, store);
		// FileUtils.copyFile(file, new File("programPractice\\pp.jpg"));
				
	}

}
  