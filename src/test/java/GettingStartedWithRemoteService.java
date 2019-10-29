import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

import static java.lang.Thread.*;

public class GettingStartedWithRemoteService {

    private static WebDriver drv;


    public static void setRemoteService() throws IOException {
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appdriver-options", options);
        URL url = new URL("http://localhost:9515");
        drv = new RemoteWebDriver(url, cap);
    }


    public void quitDriver() {
        drv.quit();
    }


    public void testGoogleSearch() throws InterruptedException {
        drv.get("http://www.google.com/");
        sleep(5000);  // Let the user actually see something!
        WebElement searchBox = drv.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        sleep(5000);  // Let the user actually see something!
    }
}
