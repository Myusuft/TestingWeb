package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    private By CompleteWebForm = new By.ByLinkText("Complete Web Form");
    public homePage(WebDriver driver) {
        this.driver = driver;
    }
    public formResultPage getComplete() {

        driver.findElement(CompleteWebForm).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new formResultPage(driver);
    }

}
