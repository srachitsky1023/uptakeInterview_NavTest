package my.interview.test.uptake.by;

import org.openqa.selenium.By;

/**
 * Created by sophia2 on 11/14/16.
 */
public interface PageLocators {

	By startHeading = new By.ByXPath("//h1");

	By approachPgBtn = new By.ById("menu-item-4164");
	By platformPgBtn = new By.ById("menu-item-4163");
	By solutionsPgBtn = new By.ById("menu-item-4172");
	By peoplePgBtn = new By.ById("menu-item-4162");
	//By mrUptakeLogo = new By.ByLinkText("#logo");
	By miniSolutionsBtn = new By.ByLinkText("Solutions");
	By miniApproachBtn = new By.ByLinkText("Approach");
	By miniPlatformBtn = new By.ByLinkText("Platform");
	By miniPeopleBtn = new By.ByLinkText("People");
	By mrUptakeLogo = new By.ByCssSelector(".icon--logo");
	By clickDownBtn = new By.ByCssSelector("svg.icon.icon--next > use");
	//By svgDownBtn = new By.ByCssSelector(".l-section__next > svg");
	By spanValueText = new By.ByCssSelector("div.callout__copy > p");
	By hamburgerBtn = new By.ByCssSelector(".hamburger");
	By spanBurgerText = new By.ByCssSelector("#menu-primary-nav-1");
	By burgerCloseBtn = new By.ByCssSelector(".hamburger__bottom");
	By fiveKeyApproach = new By.ByCssSelector("#how > div.l-wrap");
	By clickUpHomeBtn = new By.ByCssSelector("svg.icon.icon--top > use");
}
