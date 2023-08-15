package programPractice;

import java.io.File;
import java.nio.file.FileVisitOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downlaodfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://interviewquestionsanswers.org/download-pdf-Selenium#gsc.tab=0
			System.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://learnsql.com/blog/sql-basics-cheat-sheet/");
			JavascriptExecutor b=(JavascriptExecutor)driver; 
			 b.executeScript("window.scrollBy(0,1000)");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//a[.='All Forever SQL Package']")).click();
			//a[@id='ddllink']
			 File filedownload=new File("Downloads"); 
			 
			 File[] t=filedownload.listFiles();// inthe file loction irruga eila file um pkknum.
			 
			 
			 for(File file:t) {
				 file.getName().equals("//a[.='All Forever SQL Package']");
				 System.out.println("file download");
				 
			 }
			 
			 
				
				
				
				
	}

}
