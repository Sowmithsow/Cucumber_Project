package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	
	WebDriver driver;
	POM_Implementation p;
	
	@When("user search the product")
	public void user_search_the_product() throws InterruptedException {
		
		driver=Hooks.driver;
		
		p=new POM_Implementation(driver);
		
		p.searchclick();
		
		Thread.sleep(3000);
		
		p.searchbtn();
		
	}

	@When("add the product to cart")
	public void add_the_product_to_cart() throws InterruptedException {
		
		p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.addcart();
	
	}

	@When("display the product detials")
	public void display_the_product_detials() throws InterruptedException {
		
		p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.shopcartbtn();
		
		Thread.sleep(3000);
		
		p.smartphone();
		
		Thread.sleep(3000);
		
		p.getprice();
		
	
	}

	@When("check out the product")
	public void check_out_the_product() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.details();
		
		Thread.sleep(3000);
		
		p.checkoutbtn();
	
	}

	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.logout();
	 
	}

	@Then("user should logout properly")
	public void user_should_logout_properly() {
		
		System.out.println("User logout Successful");
	    
	}
}
