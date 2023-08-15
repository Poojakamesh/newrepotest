package programPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelttesting {

	@Test
	public void openggoogle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	/*
	 * @Test public void openbing() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 * WebDriver driver=new ChromeDriver(); driver.get("https://www.bing.com/");
	 * driver.quit(); }
	 */
}
