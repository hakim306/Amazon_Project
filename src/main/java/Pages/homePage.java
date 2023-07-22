package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class homePage extends actions {
	
	//home page constructor
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	//define element
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement signUp;
	
	@FindBy(xpath = "//a[@href='/-/en/gp/goldbox/?ref_=nav_em_navm_deals_0_1_1_24']")
	WebElement todayDeals;
	
	@FindBy(xpath = "//a[@id='nav-cart']")
	WebElement Cart;
	
	@FindBy(xpath = "//span[contains(text(),'Your Orders')]")
	WebElement Orders;
	
	@FindBy(xpath = "//span[contains(text(),'Your Addresses')]")
	WebElement Addresse;
	
	@FindBy(xpath = "//span[contains(text(),'Your Lists')]")
	WebElement Lists;
	
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement allTabs;
	
	//define actions.
	public void click_signUp() {
		actions.click(driver, signUp);
	}
	
	public void Move_To_signUp() {
		actions.MoveToElement(signUp, driver);
	}
	
	public void click_Today_Deals() {
		//actions.explicitWait(driver, todayDeals, Duration.ofSeconds(4000));
		actions.click(driver, todayDeals);
	}
	
	public void click_allTabs() {
		actions.MoveToElement(allTabs, driver);
		actions.click(driver, allTabs);
	}
	
	public void click_Cart() {
		actions.explicitWait(driver, Cart, Duration.ofSeconds(4000));
		actions.click(driver, Cart);
	}

	
	public void click_orders() {
		actions.click(driver, Orders);
	}
	
	public void click_addresse() {
		actions.click(driver, Addresse);
	}
	
	public void click_Lists() {
		actions.click(driver, Lists);
	}

}
