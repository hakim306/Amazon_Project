package Base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.extentReport;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void Load_config() {
		extentReport.setExtent();
	}
	
	@BeforeClass
	public static void Launch() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.get("https://www.amazon.eg/-/en/ref=nav_bb_logo");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void afterTestSuite() {
		driver.quit();
		
	}
	
	@AfterSuite
	public void end_config() {
		//extentReport.endReport();
	}
	
	

}
