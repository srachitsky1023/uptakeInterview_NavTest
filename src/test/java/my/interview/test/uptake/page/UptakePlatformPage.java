package my.interview.test.uptake.page;


import framework.FrameworkBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static my.interview.test.uptake.by.PageLocators.hamburgerBtn;
import static my.interview.test.uptake.by.PageLocators.miniSolutionsBtn;
import static my.interview.test.uptake.by.PageLocators.spanBurgerText;


/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakePlatformPage {
    RemoteWebDriver driver = null;
    WebDriverWait wait = null;


    public UptakePlatformPage() {
        this.driver = FrameworkBase.driverCabinet.get();
        this.wait = new WebDriverWait(driver, 10);
    }

    public void validatePlatformPage() {
        System.out.println("Validating platform page...");

        String expectedTitleText = "Platform – Uptake";
        //String exptectedText = "We built a platform that will transform the world of industry.";
        String actualTitleText = driver.getTitle();
        String platformBuilt = driver.findElement(By.xpath("//div/div/div/h2")).getText();
        String itWorks = driver.findElement(By.cssSelector("nav.animation-nav.js-animation-nav")).getText();
        String proprietaryPlatform = driver.findElement(By.cssSelector("#demands > div.l-wrap")).getText();

        Assert.assertEquals(expectedTitleText, actualTitleText);
        System.out.println("... _______________Uptake Platform page validated.______________.\n" + platformBuilt + itWorks + proprietaryPlatform);
    }

    public void resizePlatformPage() {
        System.out.println(driver.manage().window().getSize());
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
//
//    public void clickBurgerCloseBtn() {
//        WebElement mrBurgerCloseBtn = driver.findElement(burgerCloseBtn);
//        mrBurgerCloseBtn.click();
//    }
//    public void maximizePlatformPage() {
//        System.out.println(driver.manage().window().getSize());
//        Dimension d = new Dimension(1920, 1057);
//        //Resize the current window to the given dimension
//        driver.manage().window().setSize(d);
//    }

    public void clickSolutionsPage() {

        System.out.println("Navigating to Solutions Page");
        WebElement weSolutionsPgtn = wait.until(ExpectedConditions.visibilityOfElementLocated(miniSolutionsBtn));
        weSolutionsPgtn.click();

    }
}
//    public void validatePlatformPage() {
//        System.out.println("Validating platform page...");
//
//        String expectedTitleText = "Platform – Uptake";
//        //String exptectedText = "We built a platform that will transform the world of industry.";
//        String actualTitleText = driver.getTitle();
//
//        Assert.assertEquals(expectedTitleText, actualTitleText);
//        System.out.println("... Uptake Platform page validated.\n");
//    }
//    public void clickSolutionsPage() {
//
//        System.out.println("Navigating to Solutions Page");
//        WebElement weSolutionsPgtn = wait.until(ExpectedConditions.visibilityOfElementLocated(solutionsPgBtn));
//        weSolutionsPgtn.click();



