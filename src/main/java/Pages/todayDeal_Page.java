package Pages;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class todayDeal_Page extends actions {

	// define today deal contructor.
	public todayDeal_Page() {
		PageFactory.initElements(driver, this);
	}

	
	//define element.
	@FindBy(xpath = "//span[contains(text(),'Baby Fashion')]")
	WebElement secoundCategory;
	
	
	//define actions.
	public void click_secoundCategory() {
		actions.click(driver, secoundCategory);
	}

}
