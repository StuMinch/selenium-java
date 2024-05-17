import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

    // Navigate to this URL using another browser https://the-internet.herokuapp.com/
    // Navigate to this URL https://example.cypress.io/
    // Navigate to https://react-shopping-cart-67954.firebaseapp.com/

    @Test
    public void chromeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.quit();
    }
    @Test
    public void cypressTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.cypress.io/");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void shoppingCartTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(3000);
        driver.quit();
    }
}
