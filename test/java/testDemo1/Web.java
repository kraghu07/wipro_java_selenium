package testDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Web {
//	WebDriver driver = new ChromeDriver();
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void launchGoogle() {
	driver.get("https://www.geeksforgeeks.org/");
	String pageTitle = driver.getTitle();

	 System.out.println("Page Title: " + pageTitle);
	 try {

         Thread.sleep(3000);

     } catch (InterruptedException e) {

         e.printStackTrace();

     }
//	 driver. Quit();


}
}
