package mustafa.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

        private static WebDriver driver;


        public static WebDriver getDriver(){


            if(driver == null){

                String browser = ConfigurationReader.getProperty("browser");
                switch (browser){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    default:
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                }
            }
            return driver;
        }
}
