package Pages;

import org.openqa.selenium.WebDriver;

public class formResultPage {
    private WebDriver driver;

    public formResultPage(WebDriver driver){
        this.driver = driver;
    }
    public String getUrl(){
        driver.getCurrentUrl();
        return driver.getCurrentUrl();
    }

}
