package programPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chromedriver_win32 (1).driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver_win32 (1).exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://money.rediff.com/gainers");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     // WebElement table=driver.findElement(By.className("dataTable"));
 /* List<WebElement> allcolumn= driver.findElements(By.tagName("th"));
   for( WebElement heading: allcolumn) {
	  String s= heading.getText();
	   System.out.println(s);
	   
   }
	  //getting size
   
   List<WebElement> allrows=driver.findElements(By.cssSelector("tbody tr"));
   int size=allrows.size();
   
   System.out.println("rows"+size);
   */
		  List<WebElement> allrows=driver.findElements(By.cssSelector("tbody tr"));
   for(WebElement row:allrows) {
	   List<WebElement> column  = row.findElements(By.tagName("td"));
	   
	   WebElement c=column.get(0);
	   
	   
   
	   System.out.println("only column"+c.getText());
	   
	   
   }
   
   
   
   
   
   
   
      
      
      
      
      
      
      
      driver.quit();
		  
		  
		

	}

}
