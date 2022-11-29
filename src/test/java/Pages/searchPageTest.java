package Pages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class searchPageTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void driverTest(){
        searchPage search_page = new searchPage(driver);
        search_page.setSearch_bar("puan");
        searchResultPage resultPage = search_page.clickButton();
        String result = resultPage.getPageTitle().toLowerCase();
        Assert.assertTrue(result.contains("puan"));
//        driver.quit();
    }
}