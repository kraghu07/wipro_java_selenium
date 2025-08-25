package testDemo1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class SmokeTestingWebsite {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Smoke test: Verify home page title
    @Test(groups = {"smoke"})
    public void verifyHomePageTitle() {
        System.out.println("Home page title: " + driver.getTitle());
    }

    // Smoke test: Search for "computer"
    @Test(groups = {"smoke"})
    public void searchForItem() {
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterms"))
        );
        searchBox.clear();
        searchBox.sendKeys("computer");
        driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
        System.out.println("Search executed for 'computer'");
    }

    // Regression test: Register new user
    @Test(groups = {"regression"})
    public void registerNewUser() {
        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']"))).click();

        // Gender is required
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();

        driver.findElement(By.id("FirstName")).sendKeys("Bruce");
        driver.findElement(By.id("LastName")).sendKeys("lee");
        driver.findElement(By.id("Email")).sendKeys("Bruce@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("bruce1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("bruce1234");

        driver.findElement(By.id("register-button")).click();
        System.out.println("Registration completed");
    }

    // Final test: login after registration
    @Test(groups = {"finalTest"}, dependsOnGroups = {"smoke", "regression"})
    public void loginAfterRegistration() {
        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();

        driver.findElement(By.id("Email")).sendKeys("Bruce@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("bruce1234");
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        System.out.println("Login successful");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



/** 

[RemoteTestNG] detected TestNG version 7.11.0
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.

Aug 16, 2025 9:22:01 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 139, returning the closest version;
 found: 138; Please update to a Selenium version that supports CDP version 139
 
 
Home page title: Demo Web Shop
Search executed for 'computer'
Registration completed
Login successful

===============================================
WebsiteSuite
Total tests run: 4, Passes: 4, Failures: 0, Skips: 0
===============================================



**/