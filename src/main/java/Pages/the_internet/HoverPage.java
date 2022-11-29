package Pages.the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private Actions action;
    private By imageFigure = new By.ByClassName("figure");
    private By figcaption = new By.ByClassName("figcaption");
    private By header = new By.ByTagName("h5");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
    }

    public void hoverImage(Integer index) {
        action.moveToElement(driver.findElements(imageFigure).get(index)).perform();
    }

    public String getFigcaption() {
        for (int i = 0; i < driver.findElements(figcaption).size(); i++) {
            if (driver.findElements(header).get(i).isDisplayed()) {
                return driver.findElements(header).get(i).getText();
            }
        }
        return null;
    }


}
