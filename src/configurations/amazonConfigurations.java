package configurations;

import Applications.amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Objects;
import java.util.Scanner;

public class amazonConfigurations {
public static String browser="chrome";
    public static WebDriver driver=null;
    @BeforeMethod
    public static void setUpAmazon() throws InterruptedException {

        if(Objects.equals(browser, "chrome")) {
            driver = new ChromeDriver();
        }
        else if(Objects.equals(browser, "firefox")){
            driver=new FirefoxDriver();
        }
        driver.get("https://www.amazon.com/");

        driver.manage().window().fullscreen();// to make the amazon website full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Indirect wait for element.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//wait for the loading page
    }
@AfterMethod
    public static void driverClose() throws InterruptedException {
        Thread.sleep(1000);//use to keep wait the browser so i can input the code
        driver.close();// to close the website from the browser
    }
}