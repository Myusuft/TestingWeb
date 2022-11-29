package Pages.the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {
    private WebDriver driver;
    private Actions actions;
    private By columnA = new By.ById("column-a");
    private By columnB = new By.ById("column-b");

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void dragColumnAtoColumnB() {
        actions.dragAndDrop(
                driver.findElement(columnA),
                driver.findElement(columnB)
        ).perform();
    }
}
