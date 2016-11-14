package my.interview.test.uptake.page;

import framework.FrameworkBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static my.interview.test.uptake.by.PageLocators.mrUptakeLogo;


/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakePeoplePage {
    RemoteWebDriver driver = null;
    WebDriverWait wait = null;

    //By mrUptakeLogo = new By.ByCssSelector(".icon--logo");

    public UptakePeoplePage() {
        this.driver = FrameworkBase.driverCabinet.get();
        this.wait = new WebDriverWait(driver, 10);
    }


    public void validatePeoplePage() {
        System.out.println("Validating people page...\n" + "Current window size is----->\n" + driver.manage().window().getSize());

        String exptectedTitleText = "People – Uptake";
        //String exptectedTitleText = "We're building a company that values curiosity, exploration and industry.";
        String actualTitleText = driver.getTitle();

        Assert.assertEquals(exptectedTitleText, actualTitleText);
        System.out.println("... Uptake People page validated.\n");
    }
    public void navigatingBacktoHomePage(){

        System.out.println("Navigating back to home page");
        WebElement weLogoUptake = wait.until(ExpectedConditions.visibilityOfElementLocated(mrUptakeLogo));
        weLogoUptake.click();

        System.out.println("Clicking Uptake Logo");



    }
}


