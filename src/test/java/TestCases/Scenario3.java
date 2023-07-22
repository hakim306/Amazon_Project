package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.homePage;
import Pages.signinPage;

public class Scenario3 extends BaseClass{
	
	@Test
	public static void verify_Lists_When_User_Not_Logged_In() {
		homePage homePage=new homePage();
		homePage.Move_To_signUp();
		homePage.click_orders();
		
		signinPage signinPage=new signinPage();
		//signinPage.verify_signinForm();
		signinPage.click_logo();
		
		homePage.Move_To_signUp();
		homePage.click_addresse();
		//signinPage.verify_signinForm();
		signinPage.click_logo();
		
		homePage.Move_To_signUp();
		homePage.click_Lists();

		
	}

}
