package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class Secound_Category_Page extends actions{
	
	public Secound_Category_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//define elements.
	@FindBy(xpath = "//div[@class='a-row Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp']//div[@class='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'][1]")
	WebElement firstProduct;
	
	
	public void click_first_product() {
		actions.implicitWait(driver, 7000);
		actions.MoveToElement(firstProduct, driver);
		actions.click(driver, firstProduct);
	}

}
