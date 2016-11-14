package my.interview.test.uptake.test;

import framework.FrameworkBase;
import my.interview.test.uptake.page.UptakeApproachPage;
import my.interview.test.uptake.page.UptakeFrontPage;
import my.interview.test.uptake.page.UptakePeoplePage;
import my.interview.test.uptake.page.UptakePlatformPage;
import my.interview.test.uptake.page.UptakeSolutionsPage;
import org.testng.annotations.Test;

/**
 * Created by sophia2 on 11/14/16.
 */
public class UptakeNavigationTest extends FrameworkBase {

	@Test
	public void navigationTest(){

		UptakeFrontPage frontPage = new UptakeFrontPage();

		frontPage.openPage();
		frontPage.validateHomePage();
		frontPage.clickArrowBtn();
		frontPage.assertArrowBtnClicked();
		frontPage.scrollArrowBtn();
		frontPage.clickApproachPage();

		UptakeApproachPage approachPage = new UptakeApproachPage();

		approachPage.resizeApproachPage();
		approachPage.validateApproachPage();
		approachPage.clickHamburgerMenu();
		approachPage.clickBurgerCloseBtn();
		approachPage.maximizeApproachPage();
		approachPage.clickPlatformPage();

		UptakePlatformPage platformPage = new UptakePlatformPage();

		platformPage.validatePlatformPage();
		platformPage.resizePlatformPage();
		platformPage.clickHamburgerMenu();
		//platformPage.clickBurgerCloseBtn();
		//platformPage.maximizePlatformPage();
		platformPage.clickSolutionsPage();



		UptakeSolutionsPage solutionsPage = new UptakeSolutionsPage();

		solutionsPage.validateSolutionsPage();
		solutionsPage.resizeSolutionsPage();
		solutionsPage.clickArrowBtn();
		solutionsPage.scrollArrowBtn();
		solutionsPage.clickPeoplePage();

		UptakePeoplePage peoplePage = new UptakePeoplePage();

		peoplePage.validatePeoplePage();
		peoplePage.navigatingBacktoHomePage();
		frontPage.validateHomePage();


	}
}
