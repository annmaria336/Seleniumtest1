package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class immigration_advertising_disclosure {
WebDriver driver;
@FindBy(xpath = "//a[text()='Advertising Disclosure']")
WebElement Advertising_Disclosure_Title;

public immigration_advertising_disclosure(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public String Advertising_Disclosure() {
	return (Advertising_Disclosure_Title.getText());
}
}
