package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class immigration_home_page {
WebDriver driver;
@FindBy(xpath="(//a[@class='elementor-item has-submenu'])[1]")
WebElement immigration_home_page_about;
@FindBy(xpath = "(//a[text()='Advertising Disclosure'])[1]")
WebElement immigration_home_page_Advertising_disclosure_button;
@FindBy(xpath = "//button[@class='align-right primary slidedown-button']")
WebElement immigration_allow_button;



public immigration_home_page(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
public WebElement aboutButton() {
	return immigration_home_page_about;
}
public void clickOnAdvertisingDisclosureButton() {
	immigration_home_page_Advertising_disclosure_button.click();
}
public void clickOnAllownotificationmodel() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
	immigration_allow_button.click();
}

	
}



