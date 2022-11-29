package Pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class formPageTest {

    private static WebDriver driver;
    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
    }
    //test for all
    @Test
    public void driverTest(){
        homePage home_page = new homePage(driver);
        home_page.getComplete();
        formPage formPage = new formPage(driver);
        formPage.setFirstName("Puan");
        formPage.setLastName("Kong");
        formPage.setJobTitle("QA");
        formPage.setEducation();
        formPage.setSex();
        formPage.setExperience("0-1");
        formPage.setDate("10/10/2022");
        formPage.getSubmitButton();
        formResultPage formResultPage = new formResultPage(driver);
        Assertions.assertEquals("https://formy-project.herokuapp.com/thanks", formResultPage.getUrl());
//        driver.quit();
    }

}