package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Actions.actions;
import Base.BaseClass;
import Pages.homePage;
import Pages.signinPage;

public class Scenario1 extends BaseClass {
	
	@Test(priority = 1)
	public static void Login_With_Valide_Email_notRegestered() throws InterruptedException{
		actions.pageLoadWait(driver, 3000);
		homePage homePage=new homePage();
		homePage.click_signUp();
		
		signinPage signinPage=new signinPage();
		signinPage.Validate_Email();
	}
}
