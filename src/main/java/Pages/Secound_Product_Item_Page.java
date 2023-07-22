package Pages;

import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class Secound_Product_Item_Page extends actions{
	
	public Secound_Product_Item_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//define elements.
	@FindBy(xpath = "//div[@id='octopus-dlp-asin-stream']//ul/li[2]")
	WebElement babySecoundProduct;
	
	public void click_babySecoundProduct() {
		//actions.explicitWait(driver, babySecoundProduct, Duration.ofSeconds(10000));
		actions.implicitWait(driver, 7000);
		actions.click(driver, babySecoundProduct);
	}

}
