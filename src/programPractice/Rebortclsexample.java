package programPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rebortclsexample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1).chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("poojq");
	
		//driver.findElement(By.id("enterimg")).click();
		//Thread.sleep(2000);
	//driver.findElement(By.id("imagesrc")).click();
		//robot.setAutoDelay(2000);
		//Thread.sleep(2000);
		driver.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster_Login-monster%20login-Both-Brand---637202034913---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster_Login-monster%20login-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20login&gclid=Cj0KCQjw7aqkBhDPARIsAKGa0oJYH6gbiAZlqWj2W0wfJab5EA_K8Ii_4SnijsqpmoficCloku8_By8aAo4nEALw_wcB");
		driver.findElement(By.className("uploadResume")).click();
		Thread.sleep(2000);
		String file="C:\\Users\\ADMIN\\Downloads\\Questions.docx";
		StringSelection s=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}