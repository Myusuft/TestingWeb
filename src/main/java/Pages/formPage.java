package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class formPage {
    private By firstname = new By.ById("first-name");
    private By lastname = new By.ById("last-name");
    private By jobtitle = new By.ById("job-title");
    private By education = new By.ById("radio-button-1");
    private By sex = new By.ById("checkbox-1");
    private By experience = new By.ById("select-menu");
    private By date = new By.ById("datepicker");
    private By submit = new By.ByCssSelector(".btn.btn-lg.btn-primary");
    private WebDriver driver;

    public formPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setFirstName(String query) {
        driver.findElement(firstname).sendKeys(query);
    }
    public void setLastName(String query) {
        driver.findElement(lastname).sendKeys(query);
    }
    public void setJobTitle(String query) {
        driver.findElement(jobtitle).sendKeys(query);
    }
    public void setEducation() {
        driver.findElement(education).click();
    }
    public void setSex() {
        driver.findElement(sex).click();
    }
    public void setExperience(String query) {
        new Select(driver.findElement(experience)).selectByVisibleText(query);
    }
    public void setDate(String query) {
        driver.findElement(date).sendKeys(query);
    }
    public void getSubmitButton() {
        driver.findElement(submit).click();
    }

}
