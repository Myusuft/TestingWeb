package Pages;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class loginPageTest {
    private static WebDriver driver;
    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @Test
    public void driverTest(){
        loginPage loginPage = new loginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginResultPage resultPage = loginPage.clickButton();
        Boolean result = resultPage.getLoginStatus();
        Assert.assertTrue(result);
        driver.quit();
    }

    @Test
    public void loginFailTest(){
        loginPage loginPage = new loginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_123");
        loginResultPage resultPage = loginPage.clickButton();
        Boolean result = resultPage.getLoginStatus();
        WebElement foo = new WebDriverWait(driver, 3)
                .until(driver -> driver.findElement(By.className("error-message-container")));
        Assert.assertFalse(result);
        assertEquals("Epic sadface: Username and password do not match any user in this service",foo.getText() );
    }

    //test for logout
    @Test
    public void logoutTest(){
        loginPage loginPage = new loginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginResultPage resultPage = loginPage.clickButton();

        Boolean result = resultPage.getLoginStatus();
        Assert.assertTrue(result);
//        driver.quit();

    }

    // test explicit waits selenium
//    @Test
//    public void explicitWaitsTest(){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com/ncr");
//        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
//        // Initialize and wait till element(link) became clickable - timeout in 10 seconds
//        WebElement firstResult = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
//        // Print the first result
//        System.out.println(firstResult.getText());
//
//        WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(driver -> driver.findElement(By.name("q")));
//        assertEquals(foo.getText(), "Hello from JavaScript!");
//    }


}