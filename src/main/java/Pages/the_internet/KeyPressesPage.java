package Pages.the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {
    private WebDriver driver;
    private Actions action;
    private By inputField = new By.ById("target");
    private By resultText = new By.ById("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
    }

    public void enterKey(Keys key) {
        action.sendKeys(driver.findElement(inputField), key).perform();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
