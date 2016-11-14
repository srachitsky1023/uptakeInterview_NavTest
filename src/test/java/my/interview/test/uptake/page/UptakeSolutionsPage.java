package my.interview.test.uptake.page;

import framework.FrameworkBase;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static my.interview.test.uptake.by.PageLocators.clickDownBtn;
import static my.interview.test.uptake.by.PageLocators.clickUpHomeBtn;
import static my.interview.test.uptake.by.PageLocators.peoplePgBtn;


/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakeSolutionsPage {
    RemoteWebDriver driver = null;
    WebDriverWait wait = null;

    //By peoplePgBtn = new By.ByCssSelector("#menu-item-4162");

    public UptakeSolutionsPage() {
        this.driver = FrameworkBase.driverCabinet.get();
        this.wait = new WebDriverWait(driver, 10);
    }



    public void validateSolutionsPage() {
        System.out.println("Validating solutions page...\n" + "Current window size is----->\n" + driver.manage().window().getSize());


        String expectedTitleText = "Solutions – Uptake";
       // String exptectedTitleText = "Our industry solutions improve uptime, minimize failures, reduce fuel costs, and streamline operations.";
        String actualTitleText = driver.getTitle();

        Assert.assertEquals(expectedTitleText, actualTitleText);
        System.out.println("... Uptake Solutions Page validated.\n");
    }
    public void resizeSolutionsPage() {
        System.out.println(driver.manage().window().getSize());
        Dimension d = new Dimension(1057, 750);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);

    }

    public void clickArrowBtn() {
        System.out.println(".....Click arrow down on home page.....");
        WebElement divDownBtn = wait.until(ExpectedConditions.elementToBeClickable(clickDownBtn));
        divDownBtn.click();
    }
    public void scrollArrowBtn(){
        WebElement weScrollDown = driver.findElement(clickUpHomeBtn);
        Actions actions = new Actions(driver);

        actions.click(weScrollDown).perform();
    }
    public void clickPeoplePage() {
        WebElement wePeoplePgtn = wait.until(ExpectedConditions.visibilityOfElementLocated(peoplePgBtn));
        wePeoplePgtn.click();


        System.out.println("Navigating to People Page");
    }
}
