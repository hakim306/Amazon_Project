package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Actions.actions;

public class addToCart_Page extends actions{
	
	public addToCart_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//define element.
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceed;
	
	
	@FindBy(xpath = "//span[@class='a-price sw-subtotal-amount']//span[2]/span[2]")
	WebElement Price;
	
	
	public String get_price() {
		actions.explicitWait(driver, proceed, Duration.ofSeconds(5000));
		String amount=Price.getText();
		System.out.println("the total amount is: "+amount);
		return amount;
	}
	
	public void click_Proceed() {
		actions.click(driver, proceed);
	}

}
