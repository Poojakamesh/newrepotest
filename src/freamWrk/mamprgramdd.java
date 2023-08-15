package freamWrk;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class mamprgramdd {
	
	  WebDriver driver;
	 
	  @BeforeTest
	  public void Setup()
	  {
	  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	  }
	 
	  @Test(dataProvider ="z")
	  public void Verifytest(String user,String pass) throws InterruptedException
	  {
	  driver.findElement(By.xpath("//input[@name='email']")).clear();
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='pass']")).clear();
	      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	      Thread.sleep(2000);
	 
	  }
	 
	  @AfterTest
	  public void Teardown()
	  {
	  driver.close();
	  }
	 
	  @DataProvider(name="w")
	  public Object[][] getdata()
	  {
	  Object[][] ob= new Object[3][2];
	 
	  ob[0][0]="cts@gmail.com";
	  ob[0][1]="w123";          //1 row
	 
	  ob[1][0]="amzon@gmail.com";
	  ob[1][1]="java";          //2 row
	 
	  ob[2][0]="infosys@gmail.com";
	  ob[2][1]="python";          //3 row
	 
	  return ob;
	  }
	 
	  @DataProvider(name="p")
	  public Object[][] get()
	  {
	  Object[][] ob= new Object[5][2];
	 
	  ob[0][0]="cts@gmail.com";          //3+2=5
	  ob[0][1]="w123";          //1 row
	 
	  ob[1][0]="amzon@gmail.com";
	  ob[1][1]="java";          //2 row
	 
	  ob[2][0]="infosys@gmail.com";
	  ob[2][1]="python";          //3 row
	 
	  ob[3][0]="ibm@gmail.com";
	  ob[3][1]="p1234";           //4 row
	 
	  ob[4][0]="accenture@gmail.com";
	  ob[4][1]="tester";          //5 row
	 
	  return ob;
	  }
	 
	  @DataProvider(name="z")
	  public Object[][] get1()
	  {
	  Object[][] ob= new Object[6][2];
	 
	  ob[0][0]="cts@gmail.com";          //3+2=5
	  ob[0][1]="w123";          //1 row
	 
	  ob[1][0]="amzon@gmail.com";
	  ob[1][1]="java";          //2 row
	 
	  ob[2][0]="infosys@gmail.com";
	  ob[2][1]="python";          //3 row
	 
	  ob[3][0]="ibm@gmail.com";
	  ob[3][1]="p1234";           //4 row
	 
	  ob[4][0]="accenture@gmail.com";
	  ob[4][1]="tester";          //5 row
	 
	  ob[5][0]="coleninfotech@gmail.com";
	  ob[5][1]="t90";    
	 
	  return ob;
	  }
}
