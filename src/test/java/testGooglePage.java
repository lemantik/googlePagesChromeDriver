import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URL;


public class testGooglePage {
   /* public static void main(String[] args) {
        WebDriver driver = new RemoteWebDriver(
                new URL("http://127.0.0.1:9515"),
                new ChromeOptions());
        driver.get("http://www.google.com");
        driver.quit();
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
    }*/

    //public WebDriver driver = new ChromeDriver();
/*    public WebDriver driver = new RemoteWebDriver(
            new URL("http://127.0.0.1:9515"),
            new ChromeOptions());

    @Before
    /*public void setUp(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "drivers/phantomjs"//.exe"
        );
        driver = new PhantomJSDriver(caps);
    }
    public void setUpDriver(){
        WebDriver driver = new ChromeDriver();
    }
    @Test
    public void start(){
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64));
        driver.quit();
    }

    @After
    public void SetDown(){
        driver.close();
        driver.quit();
    }*/
}