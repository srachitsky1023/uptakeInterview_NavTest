package my.interview.test.uptake.page;


import framework.FrameworkBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static my.interview.test.uptake.by.PageLocators.*;

/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakeFrontPage {
    String url = "http://uptake.com";


    RemoteWebDriver driver = null;
    WebDriverWait wait = null;

    public UptakeFrontPage() {
        this.driver = FrameworkBase.driverCabinet.get();
        this.wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    public void openPage() {
        System.out.println("Opening page: " + url);
        driver.get(url);
    }

    public void validateHomePage() {
        System.out.println("Validating home page...");


        String exptectedTitleText = "Uptake – Analytics for the Industrial Internet";
        String actualTitleText = driver.getTitle();
        String ourStartHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(startHeading)).getText();



        Assert.assertEquals(exptectedTitleText, actualTitleText, ourStartHeading);

        System.out.println("... Home page validated.\n");

    }
    public void clickArrowBtn() {
        System.out.println(".....Click arrow down on home page.....");
        WebElement divDownBtn = wait.until(ExpectedConditions.elementToBeClickable(clickDownBtn));
        divDownBtn.click();
    }
    public void assertArrowBtnClicked() {
        String spanHelpText = driver.findElement(spanValueText).getText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(spanValueText));
        System.out.println("Tex below exits:____ \n" + spanHelpText + "------------>" + "Arrow Button Has Been Clicked");
    }
    public void scrollArrowBtn(){
        WebElement weScrollDown = driver.findElement(clickUpHomeBtn);
			Actions actions = new Actions(driver);

			actions.click(weScrollDown).perform();
		}


    public void clickApproachPage() {

        System.out.println("Navigating to Approach Page");
        WebElement weApproachPgbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(approachPgBtn));
        weApproachPgbtn.click();

        System.out.println("Approach Page has been Clicked");

    }

//    public void clickPlatformPage() {
//        WebElement wePlatformPgbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(platformPgBtn));
//        wePlatformPgbtn.click();
//
//    }
//
//    public void clickSolutionsPage() {
//        WebElement weSolutionsPgtn = wait.until(ExpectedConditions.visibilityOfElementLocated(solutionsPgBtn));
//        weSolutionsPgtn.click();
//
//    }
//
//    public void clickPeoplePage() {
//        WebElement wePeoplePgtn = wait.until(ExpectedConditions.visibilityOfElementLocated(peoplePgBtn));
//        wePeoplePgtn.click();
//    }
}
