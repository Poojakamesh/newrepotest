package freamWrk;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class usingdataprovider {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("weddriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.microfocus.com/logout.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	@Test(dataProvider="p")
	public void verifytest(String user,String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(1000);
	}
	@AfterTest
	public void Teardown() {
		driver.close();
	}
	@DataProvider(name="p")
	public Object[][]getdata() throws IOException{
		excelexmple e=new excelexmple("C:\\Users\\ADMIN\\Desktop\\companyname.xlsx");
		int row=e.getrow("sheet1");
		int col=e.getcolumn("sheet1");
		Object[][] ob=new Object[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				ob[i][j]=e.getsheet("sheet1", i, j);
			}
			
		}
		return ob;
		
	}
}
