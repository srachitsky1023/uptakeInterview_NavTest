package my.interview.test.uptake.page;

import framework.FrameworkBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static my.interview.test.uptake.by.PageLocators.burgerCloseBtn;
import static my.interview.test.uptake.by.PageLocators.hamburgerBtn;
import static my.interview.test.uptake.by.PageLocators.platformPgBtn;
import static my.interview.test.uptake.by.PageLocators.spanBurgerText;


/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakeApproachPage {
    RemoteWebDriver driver = null;
    WebDriverWait wait = null;


    public UptakeApproachPage() {
        this.driver = FrameworkBase.driverCabinet.get();
        this.wait = new WebDriverWait(driver, 10);

    }

    public void validateApproachPage() {
        System.out.println("Navigating to Approach Page...");

        String exptectedTitleText = "Approach – Uptake";
        // String exptectedTitleText = "How we build our products is just as important as what we build.";
        String actualTitleText = driver.getTitle();
        String fiveKeys = driver.findElement(By.xpath("//div/div/div/h2")).getText();

        Assert.assertEquals(exptectedTitleText, actualTitleText);
        System.out.println("... Uptake Approach Page Validated.\n" + fiveKeys);
    }

    public void resizeApproachPage() {
        System.out.println("Resizing Approach Page\n" + driver.manage().window().getSize());
        Dimension d = new Dimension(750, 1000);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);

    }


    public void clickHamburgerMenu() {
        WebElement mrHamburgerMenu = wait.until(ExpectedConditions.elementToBeClickable(hamburgerBtn));
        mrHamburgerMenu.click();
        String mrBurgerText = driver.findElement(spanBurgerText).getText();
        System.out.println("Burger Text Menu:-------.\n" + mrBurgerText);
    }

    public void clickBurgerCloseBtn() {
        WebElement mrBurgerCloseBtn = driver.findElement(burgerCloseBtn);
        mrBurgerCloseBtn.click();
    }

    public void maximizeApproachPage() {
        System.out.println(driver.manage().window().getSize());
        Dimension d = new Dimension(1920, 1057);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);

    }


    public void clickPlatformPage() {

        System.out.println("The current size of the window is: " + driver.manage().window().getSize());

        System.out.println("Navigating to Platform Page");
        WebElement wePlatformPgbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(platformPgBtn));
        wePlatformPgbtn.click();

    }
}





