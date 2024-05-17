package atda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public final WebDriver driver;
    WebDriverWait wait;
    int timeInSecs = 10;
    Duration duration = Duration.ofSeconds(timeInSecs);


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, duration);
    }
}
