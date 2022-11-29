package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginResultPage {

    private WebDriver driver;

    public loginResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public Boolean getLoginStatus(){
        return !driver.findElements(By.id("logout_sidebar_link")).isEmpty();
    }
}
