import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        System.setProperty("webdriver.chrome.logfile", "./chromeDriver.log");
        ChromeOptions options = new ChromeOptions();

        //options.addArguments("headless");
        options.addArguments("window-size=1280x800");
        options.addArguments("no-sandbox");
        options.addArguments("–disable-dev-shm-usage");
        options.addArguments("start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-setuid-sandbox");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("JENKINS");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}