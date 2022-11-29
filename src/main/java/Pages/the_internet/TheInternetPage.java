package Pages.the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheInternetPage {
    private WebDriver driver;
    private By linkHoverPage = new By.ByLinkText("Hovers");
    private By linkDragDrop = new By.ByLinkText("Drag and Drop");
    private By linkKeyPresses = new By.ByLinkText("Key Presses");
    private By content = new By.ById("content");

    public TheInternetPage(WebDriver driver) {
        this.driver = driver;
    }

    public HoverPage getHoverPage() {
        driver.findElement(linkHoverPage).click();

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOf(driver.findElement(content)));

        return new HoverPage(driver);
    }

    public DragDropPage getDragDropPage() {
        driver.findElement(linkDragDrop).click();

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOf(driver.findElement(content)));

        return new DragDropPage(driver);
    }

    public KeyPressesPage getKeyPressesPage() {
        driver.findElement(linkKeyPresses).click();

        new WebDriverWait(driver, 10).until(
                ExpectedConditions.visibilityOf(driver.findElement(content)));

        return new KeyPressesPage(driver);
    }


}
