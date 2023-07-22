package TestCases;

import org.testng.annotations.Test;
import java.nio.channels.NonWritableChannelException;


import org.testng.annotations.Test;


import Actions.actions;
import Base.BaseClass;
import Pages.Baby_Secound_Product_Page;
import Pages.Secound_Category_Page;
import Pages.Secound_Product_Item_Page;
import Pages.Shopping_Cart_Page;
import Pages.addToCart_Page;
import Pages.homePage;
import Pages.signinPage;
import Pages.todayDeal_Page;


public class Scenario2 extends BaseClass{
	
	@Test
	public static void buy_Product() throws InterruptedException {
		
		actions.pageLoadWait(driver, 3000);
		homePage homePage=new homePage();
		homePage.click_allTabs();
		homePage.click_Today_Deals();
		
		todayDeal_Page todayDeal_Page=new todayDeal_Page();
		todayDeal_Page.click_secoundCategory();
		
		Secound_Category_Page secound_Category_Page=new Secound_Category_Page();
		secound_Category_Page.click_first_product();
		
		Secound_Product_Item_Page secound_Product_Item_Page=new Secound_Product_Item_Page();
		secound_Product_Item_Page.click_babySecoundProduct();
		
		Baby_Secound_Product_Page baby_Secound_Product_Page=new Baby_Secound_Product_Page();
		baby_Secound_Product_Page.select_size();
		baby_Secound_Product_Page.get_productName();
		baby_Secound_Product_Page.select_Quantity();
		baby_Secound_Product_Page.click_addToCart();
		
		addToCart_Page addToCart_Page=new addToCart_Page();
		addToCart_Page.get_price();
		addToCart_Page.click_Proceed();
		
	    signinPage signinPage =new signinPage();
		signinPage.click_logo();
		homePage.click_Cart();
		
		Shopping_Cart_Page shopping_Cart_Page=new Shopping_Cart_Page();
		shopping_Cart_Page.Shopping_Cart_Get_productName();
		shopping_Cart_Page.verify_productDetails();
		
		
		/*
		Baby_Underwear_Category_Page baby_Underwear_Category_Page=new Baby_Underwear_Category_Page();
		baby_Underwear_Category_Page.click_babySecoundProduct();
		
		Baby_Bodysuit_Page baby_Bodysuit_Page=new Baby_Bodysuit_Page();
		//baby_Bodysuit_Page.select_quantity();
		baby_Bodysuit_Page.get_productName();
		baby_Bodysuit_Page.select_size();
		//baby_Bodysuit_Page.get_color();
		baby_Bodysuit_Page.select_quantity();
		baby_Bodysuit_Page.get_total();
		baby_Bodysuit_Page.click_addToCart();
		
		addToCart_Page addToCart_Page=new addToCart_Page();
		addToCart_Page.click_Proceed();
		
		signinPage signinPage =new signinPage();
		signinPage.click_logo();
		homePage.click_Cart();
		
		Shopping_Cart_Page shopping_Cart_Page=new Shopping_Cart_Page();
		shopping_Cart_Page.Shopping_Cart_Get_productName();
		shopping_Cart_Page.verify_productDetails();*/
		
		
	}
	
}
