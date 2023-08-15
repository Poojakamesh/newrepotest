package Datdrivenfreamwrk;
import java.io.*;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class normalusingjav {
	String[][] data;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("weddriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

	}
	
	@DataProvider(name="v")
	public String[][] geetingdata() throws IOException {
		
		//File excel=new File("C:\\Users\\ADMIN\\Desktop\\companyname.xlsx");
		FileInputStream n=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\companyname.xlsx");
		XSSFWorkbook wbk=new XSSFWorkbook(n);
		XSSFSheet sheet=wbk.getSheetAt(0);
	int rownum=	sheet.getLastRowNum(); //heding row skip pnnitu varum
	int fullrow=sheet.getPhysicalNumberOfRows();// full row calculion la varum
	short cellnu=sheet.getRow(0).getLastCellNum();
	System.out.println(rownum);
	System.out.println(fullrow);
	String[][] data=new String[rownum][cellnu];
		for (int i = 1; i <=rownum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellnu; j++) {
				XSSFCell cell = row.getCell(j);
				//System.out.println(cell.toString());
				//String c = cell.getStringCellValue();
				//System.out.println(c);
				DataFormatter dft=new DataFormatter();
				String value=dft.formatCellValue(cell);
				
				data[i-1][j]=value;
			}
			}
			
		
		
		wbk.close();
		return data;
		
}
		


	  @Test(dataProvider = "v") public void Verifytest(String user, String pass)
	  throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id=\"login1\"]")).clear();
	  
	  driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys(user);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
	  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
	  //driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
	  Thread.sleep(1000); }
	 

}