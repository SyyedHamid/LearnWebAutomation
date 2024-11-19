package Applications;

import configurations.amazonConfigurationHW;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonhw extends amazonConfigurationHW {


    public static void amazonHwHomepage() {
        //use Link Text for the locator
        String homePageVerify = "Best Sellers";
        String actualHomePageText = driver.findElement(By.linkText(homePageVerify)).getText();
        Assert.assertEquals(actualHomePageText, "Best Sellers", "Amazon Home Page not Found");

    }


    public static void typeInSearchBox() {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pant");

    }

    public static void clickOnSearching() {
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

    }

    public static void searchValidItem() {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("cap");//fix it by call
        clickOnSearching();

    }

    public static void seeBestSellerItems() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();

    }

    public static void seeTodaysDeal() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();

    }

    public static void SeeHolidaysDeal() {

        driver.findElement(By.xpath("//*[@id=\"nav-holiday\"]")).click();

    }

    public static void SeeMedicalCareService() {

        driver.findElement(By.xpath("//*[@id=\"nav_link_allhealthingress\"]/span[1]")).click();

    }

    public static void SeenewreleaseItems() {

        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).click();

    }

    public static void moversShakers() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[4]/a")).click();

    }

    public static void subscribeSave() {

        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[28]/a")).click();

    }

    //*[@id="hmenu-content"]/ul[1]/li[3]/a
}

