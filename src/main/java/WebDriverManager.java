import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Admin on 07.11.14.
 */

public class WebDriverManager {

   private WebDriver webDriver;

    public WebDriver getWebDriverInstance() {
        if (null == webDriver) {
            webDriver = new FirefoxDriver();
        }
        return webDriver;
    }


}
