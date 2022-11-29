package Pages.the_internet;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class TheInternetPageTest {
    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @BeforeEach
    void setUpEach() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }

    //test for hover
    @Test
    public void hoverTest() {
        TheInternetPage theInternetPage = new TheInternetPage(driver);
        theInternetPage.getHoverPage();
        HoverPage hoverPage = new HoverPage(driver);
        hoverPage.hoverImage(0);
        String result = hoverPage.getFigcaption();
        assertEquals("name: user1", result);
    }

    //test for dragDrop
    @Test
    public void dragDropTest() {
        TheInternetPage theInternetPage = new TheInternetPage(driver);
        theInternetPage.getDragDropPage();
        DragDropPage dragDropPage = new DragDropPage(driver);
        dragDropPage.dragColumnAtoColumnB();
    }

    //test for keyPresses
    @Test
    public void keyPressesTest() {
        TheInternetPage theInternetPage = new TheInternetPage(driver);
        theInternetPage.getKeyPressesPage();
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        keyPressesPage.enterKey(Keys.SHIFT);
        String result = keyPressesPage.getResult();
        assertEquals("You entered: SHIFT", result);
    }


}