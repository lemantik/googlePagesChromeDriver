import java.io.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static java.lang.Thread.sleep;

public class GettingStartedWithService {

    private static ChromeDriverService service;
    private WebDriver driver;

    //@BeforeClass
    public static void createAndStartService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("./chromedriver"))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    //@AfterClass
    public static void stopService() {
        service.stop();
    }

    //@Before
    public void createDriver() {
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appdriver-options", options);
        driver = new RemoteWebDriver(service.getUrl(), cap);
    }

    //@After
    public void quitDriver() {
        driver.quit();
    }

    //@Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("http://www.google.by");
        sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Docker");
        searchBox.submit();
        sleep(5000);
    }


    public void testTutBy() {
        driver.get("http://www.tut.by");
    }
}