package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Implementation {
	
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	POM_Implementation(WebDriver driver){
		
		this.driver=driver;
	}
	//Login
	By Loginbtn=By.linkText("Log in");
	By user=By.id("Email");
	By pass=By.id("Password");;
	By Loginclick=By.xpath("//input[@class=\"button-1 login-button\"]");
	
	//Search
	By searchbtn=By.id("small-searchterms");
	By products=By.id("small-searchterms");
	By searchclick=By.xpath("//input[@class=\"button-1 search-box-button\"]");
	
	//Filters
	By filterclick=By.id("products-orderby");
	
	//addtocart
	By addbtn=By.xpath("//input[@value=\"Add to cart\"]");
	
	//shopcartbutton
	By shopbtn=By.linkText("Shopping cart");
	By picsmartphone=By.linkText("Smartphone");
	
	//Price Validation
	By pay=By.xpath("//span[@itemprop=\"price\"] ");
	
	//Checkout
	By place=By.id("CountryId");
	By termsofservice=By.id("termsofservice");
	By checkout=By.id("checkout");
	
	//Logout
	By logout=By.xpath("//a[@class=\"ico-logout\"]");
	
	public void loginbtn() {
		
		driver.findElement(Loginbtn).click();
	}
	
	public void username(String username,String password) {
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(Loginclick).click();
	}
	
	public void searchclick() {
		
        driver.findElement(searchbtn).click();
		
		driver.findElement(products).sendKeys("Smartphone");
	}
	
	public void searchbtn() {
		
		driver.findElement(searchclick).click();
	}
	
	public void filters() {
		
		WebElement fil=driver.findElement(filterclick);
		fil.click();
		
		Select s=new Select(fil);
		s.selectByVisibleText("Price: High to Low");
		
	}
	
	public void addcart() {
		
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");;
		
		driver.findElement(addbtn).click();
		
	}
	
	public void shopcartbtn() {
		
		driver.findElement(shopbtn).click();
	}
	
	public void smartphone() {
		
		driver.findElement(picsmartphone).click();
	}
	public void getprice() {
		
		String price=driver.findElement(pay).getText();
		
		System.out.println("Product price is: "+price);
	}
	
	public void details() {
		
		driver.navigate().back();
		
		WebElement country=driver.findElement(place);
		
		country.click();
		
		Select s=new Select(country);
		
		s.selectByVisibleText("Canada");
		
		driver.findElement(termsofservice).click();	
		
	}
	
	public void checkoutbtn() {
		
		driver.findElement(checkout).click();
	}
	
	public void logout() {
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		
		driver.findElement(logout).click();
		
	}

}
