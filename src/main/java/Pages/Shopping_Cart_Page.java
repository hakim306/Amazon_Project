package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Actions.actions;

public class Shopping_Cart_Page extends actions{
	
	public Shopping_Cart_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//define elements.
	@FindBy(xpath = "///span[@class='a-truncate-cut']")
	WebElement productName;
	
	@FindBy(xpath = "//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-base']//li[4]//span[2]")
	WebElement Size;
	
	public String Shopping_Cart_Get_productName() {
		actions.explicitWait(driver, productName, Duration.ofSeconds(4000));
		String name=productName.getText();
		System.out.println("the product name in shopping cart: "+ name);
		return name;
	}
	
	
	 public void verify_productDetails() throws InterruptedException {
		Thread.sleep(4000);
		String size=Size.getText();
		Assert.assertEquals(size, "12-18M");
	}

}
