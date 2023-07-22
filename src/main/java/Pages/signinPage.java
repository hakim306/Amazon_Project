package Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Actions.actions;
import Base.BaseClass;

public class signinPage extends BaseClass {
	
	//sign in page constructor
	public signinPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//define elements.
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//div[@id='auth-error-message-box']")
	WebElement errorMessage;
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
	WebElement amazonLogo;
	
	@FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")
	WebElement signinForm;
	
	public void Validate_Email() throws InterruptedException {
		actions.explicitWait(driver, Email, Duration.ofSeconds(5000));
		actions.settext(Email, "mhakimmohamed862@gmail.com");
		actions.click(driver, continueBtn);
		actions.explicitWait(driver, errorMessage,Duration.ofSeconds(6000));
		Assert.assertTrue(errorMessage.isDisplayed());
	}
	
	public void click_logo() {
		actions.click(driver, amazonLogo);
	}
	
	public void verify_errorMessage() {
		Assert.assertTrue(errorMessage.isDisplayed());
	}

}
