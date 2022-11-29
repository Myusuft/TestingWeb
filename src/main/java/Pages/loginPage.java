package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private By username = new By.ByName("user-name");
    private By password = new By.ByName("password");
    private By login = new By.ByName("login-button");
    private WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsername(String query) {
        driver.findElement(username).sendKeys(query);
    }
    public void setPassword(String query) {
        driver.findElement(password).sendKeys(query);
    }
    public By getLoginButton() {
        return login;
    }
    public loginResultPage clickButton() {
        driver.findElement(login).submit();
        return new loginResultPage(driver);
    }
}
