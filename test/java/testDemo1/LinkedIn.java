package testDemo1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedIn {
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void signupAndLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 5️⃣ Skip OTP/email verification by going directly to login
        driver.get("https://www.linkedin.com/login");

        // 6️⃣ Click "Sign in with email"
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("#organic-div > form > div.login__form_action_container > button")
//        )).click();

        // 7️⃣ Enter login credentials
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("raghu@gmail.com");
        driver.findElement(By.id("password")).sendKeys("krish@123");
        driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")).click();
        
        
        WebElement searchBox = driver.findElement(By.cssSelector("#global-nav-typeahead > input"));
        
        searchBox.clear();
        searchBox.sendKeys("visa");
        searchBox.sendKeys(Keys.ENTER);

//        driver.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'artdeco-button') and contains(@class, 'full-width') and .//span[text()='View page']]")).click();
//        driver.findElement(By.xpath("//a[text()='Jobs']")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'visa')]")).click();
//        //span[@class='image-text-lockup__text ']/span[text()='View page']
//        searchBox.submit();
        Thread.sleep(5000);
      
        // 10️⃣ Close browser
        driver.quit();
    }
}
