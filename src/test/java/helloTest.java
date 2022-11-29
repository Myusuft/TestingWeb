import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.session.EdgeFilter;

import java.util.ArrayList;
import java.util.List;

public class helloTest {
//    @BeforeAll
//    public static void setup() {
//        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//    }
    @Test
    public void manualTest() {
        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
    @Test
    public void internetChromeTest() {
        List<String> list = new ArrayList<>();
        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> ab = driver.findElements(org.openqa.selenium.By.tagName("li"));
        for (WebElement lis : ab){
            list.add(lis.getText());
            System.out.println(lis.getText());
        }
        System.out.println(list);
        driver.quit();
    }
    @Test
    public void internetTest() {
        List<String> list = new ArrayList<>();
        System.setProperty("webdriver.edge.driver","Resource/msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> ab = driver.findElementsByTagName("li");
        for (WebElement lis : ab){
            list.add(lis.getText());
            System.out.println(lis.getText());
        }
        System.out.println(list);
        driver.quit();
//        String title = driver.getTitle();
//        System.out.println(title);
//        driver.quit();

    }

    @Test
    public void internetATest() {
        List<String> list = new ArrayList<>();
        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        WebElement ab = driver.findElement(org.openqa.selenium.By.linkText("Shifting Content"));
        ab.click();
        WebElement abc = driver.findElement(org.openqa.selenium.By.linkText("Example 1: Menu Element"));
        abc.click();
        System.out.println(title);
        driver.quit();
    }

//    @Test
//    public void loginTest() {
//        System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        String title = driver.getTitle();
//        WebElement ab = driver.findElement(org.openqa.selenium.By.id("user-name"));
//        ab.sendKeys("standard_user");
//        WebElement abc = driver.findElement(org.openqa.selenium.By.id("password"));
//        abc.sendKeys("secret_sauce");
//        WebElement abcd = driver.findElement(org.openqa.selenium.By.id("login-button"));
//        abcd.click();
//        System.out.println(title);
//        driver.quit();
//    }

}
