package tastecases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePageTest {

    @Test
    public static void getStart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().fullscreen();// to make the amazon website full screen

        String homePageVerify="//*[@id=\"nav-xshop\"]/a[6]";//for the verify we get xpath of a element
        String actualText=driver.findElement(By.xpath(homePageVerify)).getText();
        Assert.assertEquals(actualText,"Amazon Basics","Amazon Home Page not Found");


        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Tshirt");//use to search a Keyword inside the search box
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();//use to click on the search icon

        String tshirtPageVerify="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]";
        Boolean actualTexttshirt=driver.findElement(By.xpath(tshirtPageVerify)).isDisplayed();
        Assert.assertTrue(actualTexttshirt);

        Thread.sleep(1000);//use to keep wait the browser so i can input the code
        driver.close();// to close the website from the browser
    }
}
