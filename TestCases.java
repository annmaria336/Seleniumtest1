package AmazonTestCases;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.BaseClass;

public class TestCases extends BaseClass{
	WebDriver driver;
	@BeforeMethod
public void initilization() {
	driver = browserInitilization("chrome");
	driver.get("https://www.amazon.in/"); //https://www.flipkart.com/
	driver.manage().window().maximize();
}
	@Test
	public void TC01()
	{
		System.out.println("TEST CASE 1");
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();//name or id vechitt search chyam , name ollathin by.name and id ollathin by.id
		String brandname=driver.findElement(By.xpath("//span[text()='Apple']")).getText();
		String brandtagname=driver.findElement(By.xpath("//span[text()='Apple']")).getTagName();
		String brandclassname=driver.findElement(By.xpath("//span[text()='Apple']")).getAttribute("class");
		WebElement dropdown=driver.findElement(By.id("s-result-sort-select"));
		Select drp=new Select(dropdown);
		//drp.selectByValue("review-rank");
		drp.selectByVisibleText("Price: High to Low");
		//drp.selectByIndex(5);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		driver.findElement(By.name("field-keywords")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).submit(); // submit or click (alternate methods)
		List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        int prodcount=products.size();
		System.out.println("size"+prodcount);
		System.out.println(brandname);		
		System.out.println(brandtagname);
		System.out.println(brandclassname);
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//driver.navigate().to("https://www.flipkart.com/");
	//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
	
	//driver.close();
		//driver.findElement(By.id("nav-logo-sprites")).click();
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
		//driver.findElement(By.name("ap_email")).click();
		//driver.findElement(By.id("ap_email_login"))
		//driver.findElement(By.tagName("input"));  Tagname
		//driver.findElement(By.linkText("Shop on Amazon Business")).click(); Linktext
		//driver.findElement(By.linkText("Shop on Amazon")).click();  - Partial Linktext
        //driver.findElement(By.cssSelector("//input[id='continue']"));   -CSS Selector
	}
	/*public void initilization() {
		driver = browserInitilization("chrome");
		driver.navigate().to("https://www.immigration.ca/");
		driver.manage().window().maximize();
	}*/
	@Test
	public void TC02() {
		
	System.out.println("Test Case2");
	driver.findElement(By.xpath("//div[@class='elementor-button-wrapper']//following::a")).click();
	//driver.navigate().refresh();
	driver.navigate().to("https://form.immigration.ca/skilled-worker/");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ann Mary Joseph");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("annmaria336@gmail.com");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("4167680073");
	WebElement dropdown=driver.findElement(By.id("nationality"));
	Select drp=new Select(dropdown);
	drp.selectByVisibleText("Canada");
	WebElement dropdown1=driver.findElement(By.id("residence_country"));
	Select drp1=new Select(dropdown1);
	drp1.selectByVisibleText("India");
	WebElement dropdown2=driver.findElement(By.id("age"));
	Select drp2=new Select(dropdown2);
	drp2.selectByVisibleText("28");
	WebElement dropdown3=driver.findElement(By.id("sex"));
	Select drp3=new Select(dropdown3);
	drp3.selectByVisibleText("Female");
	driver.findElement(By.id("submitApplicationBtn")).click();
	
	}
	@Test
	public void TC03() throws InterruptedException {
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Kochi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon icon-ic-city solr-icon'])[1]")).click();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source=driver.findElement(By.id("column-a"));
		WebElement destination=driver.findElement(By.id("column-b"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(source, destination);
		//action.contextClick();   //to perform right click opertn
		driver.navigate().back();
		Thread.sleep(2000);
		//action.doubleClick(driver.findElement(By.id("search_button")));
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='Train Tickets']")));  //mouse over aavan
		driver.findElement(By.id("src")).sendKeys("Kochi");
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);
		action.build().perform();     //always required while doing draganddrop
	}
	/*public void initilization() {
		driver = browserInitilization("chrome");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}*/
@Test
		public void TC04() {
	driver.findElement(By.name("field-keywords")).sendKeys("laptop");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox']//following-sibling::i)[3]")).click();
	//driver.findElement(By.xpath("(//input[@type='checkbox']//following-sibling::i)[10]")).click();
	driver.get("https://form.immigration.ca/skilled-worker/");
	driver.findElement(By.xpath("(//label[text()='Yes'])[1]")).click();	
			}
	
		
	}

