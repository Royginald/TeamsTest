
import org.apache.commons.exec.environment.EnvironmentUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {

        ChromeOptions option = new ChromeOptions(); //
        option.addArguments("--disable-gpu", "start-maximized", "--window-size=1920,1080", "--disable-extensions", "--ignore-certificate-errors", "--no-sandbox", "--disable-dev-shm-usage", "--disable-notifications");

        if(System.getProperty("os.name").equals("Windows 10")) {
            String userPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", userPath + "/chromedriver.exe");
        } else {
            option.setBinary(EnvironmentUtils.getProcEnvironment().get("GOOGLE_CHROME_SHIM"));
        }

        WebDriver driver = new ChromeDriver(option);
        String url = "https://www.microsoft.com/en-ca/microsoft-teams/log-in";

        driver.get(url);


    }
}
