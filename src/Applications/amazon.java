package Applications;

import configurations.amazonConfigurations;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static configurations.amazonConfigurations.driver;


public class amazon  {

    public static void amazonAction(String itemName) throws InterruptedException {


        String homePageVerify = "//*[@id=\"nav-xshop\"]/a[6]";//for the verify we get xpath of a element
        String actualText = driver.findElement(By.xpath(homePageVerify)).getText();
        Assert.assertEquals(actualText, "Amazon Basics", "Amazon Home Page not Found");


        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(itemName);//use to search a Keyword inside the search box
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();//use to click on the search icon

        String tshirtPageVerify = "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]";
        Boolean actualTexttshirt = driver.findElement(By.xpath(tshirtPageVerify)).isDisplayed();
        Assert.assertTrue(actualTexttshirt);

        //for the full text of ball
        String ballPageverify="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]";
        String ballActualText=driver.findElement(By.xpath(ballPageverify)).getText();
        Assert.assertEquals(ballActualText,"\"ball\"","Ball Search page not Found");

//Partial text test
        String basketBallPageverify="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[3]/div[1]/h2/a/span";
        String basketBallActualText=driver.findElement(By.xpath(basketBallPageverify)).getText();
        Assert.assertTrue(basketBallActualText.contains("Basketball"),"Basket Ball Search page not Found");
    }
}