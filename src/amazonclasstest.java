import Applications.amazon;
import configurations.amazonConfigurations;
import org.testng.annotations.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class amazonclasstest extends amazonConfigurations {

@Test
    public static void amazonTest() throws InterruptedException {
    //setUpAmazon();
    amazon.amazonAction("pant");
    //driverClose();

}
    @Test
    public static void amazonTestShirt() throws InterruptedException {
       // setUpAmazon();
        amazon.amazonAction("shirt");
        //driverClose();

}
    @Test
    public static void ball() throws InterruptedException {

        amazon.amazonAction("ball");
        //for the partial text


    }

        }

