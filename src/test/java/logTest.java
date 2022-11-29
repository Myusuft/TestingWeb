import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logTest {
    private static WebDriver driver;
    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void loginTest() {
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        WebElement ab = driver.findElement(org.openqa.selenium.By.id("user-name"));
        ab.sendKeys("standard_user");
        WebElement abc = driver.findElement(org.openqa.selenium.By.id("password"));
        abc.sendKeys("secret_sauce");
        WebElement abcd = driver.findElement(org.openqa.selenium.By.id("login-button"));
        abcd.click();
        System.out.println(title);
//        driver.quit();
    }
}
