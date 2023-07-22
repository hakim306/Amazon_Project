package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actions.actions;

public class Baby_Secound_Product_Page extends actions{
	
	public Baby_Secound_Product_Page() {
		PageFactory.initElements(driver, this);
	}
	
	//define elements.
	@FindBy(xpath = "//select[@id='quantity']")
	WebElement Quantity;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	@FindBy(xpath = "//h1[@id='title']")
	WebElement productName;
	
	@FindBy(xpath = "//div[@id='corePriceDisplay_desktop_feature_div']")
	WebElement productPrice;
	
	@FindBy(xpath = "//div[@id='variation_color_name']//span")
	WebElement productColor;
	
	@FindBy(xpath = "//span[@class='a-size-base a-color-price a-text-bold']")
	WebElement totalAmount;
	
	@FindBy(xpath = "//select[@id='native_dropdown_selected_size_name']")
	WebElement Size;
	
	@FindBy(xpath = "//option[@id='native_size_name_0']")
	WebElement selectSize;
	
	
	/*public void select_quantity() {
		actions.explicitWait(driver, Quantity, Duration.ofSeconds(40000));
		if (actions.isDisplayed(Quantity)) {
			actions.SelectByText(Quantity, "2");
		}else {
			System.out.println("the quantity element is not exists");
		}
	}*/
	
	public void select_Quantity() {
		actions.SelectByText(Quantity, "2");
	}
	
	public void select_size(){
		try {
			explicitWait(driver, Size, Duration.ofSeconds(4000));
			actions.MoveToElement(Size, driver);
			actions.SelectByText(Size, "12-18M");
			actions.click(driver, addToCart);
			System.out.println("the size is selected");
		}catch (Exception e) {
			System.out.println("the size element cannot be selected");
		}
	}
	
	
	
	public void click_addToCart() {
		actions.click(driver, addToCart);
	}
	
	public String get_productName() {
		explicitWait(driver, productName, Duration.ofSeconds(5000));
		String name=productName.getText();
		System.out.println("he product name in baby body suite page is: "+name);
		return name;
	}
	
	public String get_price() {
		String price=productPrice.getText();
		System.out.println("The price in baby body suite page is: "+price);
		return price;
	}
	
	public String get_color() {
		String color=productPrice.getText();
		System.out.println("The color of the product in baby body suite page is: "+color);
		return color;
	}
	
	public String get_total() {
		String total=totalAmount.getText();
		System.out.println("The total amount of the product in baby body suite page is: "+total);
		return total;
	}

}
