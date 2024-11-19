package testClasses;

import Applications.amazonhw;
import configurations.amazonConfigurationHW;
import org.testng.annotations.Test;

import static Applications.amazonhw.*;


public class amazonTestHW extends amazonConfigurationHW {
    public static  String url = "https://www.amazon.com/";

    @Test(priority = 1)
    public static void amazonTest() throws InterruptedException {

        getDriver(url);
        amazonHwHomepage();
    }
    @Test(priority = 2)
    public static void searchvalidation()throws InterruptedException{
    searchValidItem();
    driverClose();

 }
    @Test(priority = 3)
    public static void searcIcon()throws InterruptedException{
        getDriver(url);
        driversleep();
        typeInSearchBox();
        clickOnSearching();
        driverClose();

    }
    @Test(priority = 4)
    public static void bestSeller()throws InterruptedException{
        getDriver(url);
        driversleep();
        seeBestSellerItems();
        driverClose();

    }

    @Test(priority = 5)
    public static void todaysDeal()throws InterruptedException{
        getDriver(url);
        driversleep();
        seeTodaysDeal();
        driverClose();

    }



}