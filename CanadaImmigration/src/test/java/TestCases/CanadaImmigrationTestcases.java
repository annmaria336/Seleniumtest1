package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Automationcore.BaseClass;
import pageClasses.amazonHomePage;
import pageClasses.immigration_advertising_disclosure;
import pageClasses.immigration_home_page;

public class CanadaImmigrationTestcases extends BaseClass{
public WebDriver driver;
immigration_home_page homepage;
immigration_advertising_disclosure advertisingdisclosurepage;
amazonHomePage ahomepage;

@BeforeMethod (groups = {"smoketest","regression"})
@Parameters({"Browser"})
public void initialization(String browser) throws Exception
{
	driver=browserInitilization(browser);
	driver.get("https://immigration.ca/");
	driver.manage().window().maximize();	
	homepage=new immigration_home_page(driver);
	advertisingdisclosurepage=new immigration_advertising_disclosure(driver);
	homepage.clickOnAllownotificationmodel();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	ahomepage =new amazonHomePage(driver);
	
	}

@Test
public void TC01() throws Exception 
{
	Actions action=new Actions(driver);
	action.moveToElement(homepage.aboutButton());
	Thread.sleep(1000);
	homepage.clickOnAdvertisingDisclosureButton();
	Assert.assertEquals(advertisingdisclosurepage.Advertising_Disclosure(), "Advertising Disclosure");
	// already click action is set in pageclass
	homepage.clickOnAllownotificationmodel();
}
@Test
public void TC02() {
	driver.get("https://www.amazon.in/");
	ahomepage.amazonsearchBox().sendKeys("iphone");
	ahomepage.searchButtonClick();
	
}
}
