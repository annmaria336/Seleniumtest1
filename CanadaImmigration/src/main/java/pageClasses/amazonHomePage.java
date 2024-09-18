package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonHomePage {
WebDriver driver;
By searchBox=By.id("twotabsearchtextbox");
By searchButton=By.id("nav-search-submit-button");

public amazonHomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public WebElement amazonsearchBox() {
	return(driver.findElement(searchBox));        
}
public void searchButtonClick() {
	driver.findElement(searchButton).click();
}

}
