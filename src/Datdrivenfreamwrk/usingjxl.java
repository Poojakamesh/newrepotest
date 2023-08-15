package Datdrivenfreamwrk;

import java.io.*;
	
	import java.time.Duration;
import java.util.Iterator;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;

	import org.testng.annotations.Test;
	public class usingjxl {
		String[][] data;
			
			int i=2;
			List<String> usernamelist=new ArrayList<String>();
			List<String> passwordlist=new ArrayList<String>();
			
			
		
			/*
			 * @DataProvider(name="logindata") public String[][] excutetest() { for(int
			 * i=0;i<usernamelist.size();i++) {
			 * loginwithbothCorrect(usernamelist.get(i),passwordlist.get(i)); } return data;
			 * }
			 */
		
		public String[][]usingdataprovider() throws IOException{
			File excel=new File("C:\\Users\\ADMIN\\Desktop\\companyname.xlsx");
			FileInputStream n=new FileInputStream(excel);
			XSSFWorkbook w= new XSSFWorkbook(n);
			XSSFSheet s=w.getSheet("sheet1");
			
			
		
			
			Iterator<Row> rowit=s.iterator(); //full taken by row
			while(rowit.hasNext()) {
			Row	rowval=rowit.next(); 
			
			//Using row find out the cell
			Iterator<Cell> cellit=rowval.iterator();
			while(cellit.hasNext()) {
				for(int i=0;i<usernamelist.size();i++) {
				if(i%2==0)
				{
				usernamelist.add(cellit.next().toString());// vara value string ila so string change panniruga java tostring
			}
				else {
					passwordlist.add(cellit.next().getStringCellValue());//using apochi string convert
				}
				i++;
			}
			}
			}
			
			for(int i=0;i<usernamelist.size();i++) {
				loginwithbothCorrect(usernamelist.get(i),passwordlist.get(i));
			}
			return data;
			
			
			
			
			
		}
		
	   
		public void loginwithbothCorrect(String uname,String pword) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.xpath(
					"//input[@name='username'][@placeholder='Username']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys( pword);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.quit();

			
		}
		public static void main(String arg[]) {
			usingjxl l=new usingjxl();
			
			
		}

	}



