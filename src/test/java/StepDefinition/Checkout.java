package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
	
	WebDriver driver;
	
	POM_Implementation p;
	
	@Given("When user searched the product")
	public void when_user_searched_the_product() throws InterruptedException {
		
		driver=Hooks.driver;
		
		p=new POM_Implementation(driver);
		
		p.searchclick();
		
		Thread.sleep(3000);
		
		p.searchbtn();
	
	}

	@When("added the product to cart")
	public void added_the_product_to_cart() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.addcart();
	
	}

	@When("displayed the price")
	public void displayed_the_price() throws InterruptedException {
		
		p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.shopcartbtn();
		
		Thread.sleep(3000);
		
		p.smartphone();
		
		Thread.sleep(3000);
		
		p.getprice();	

	}

	@When("added the address details")
	public void added_the_address_details() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.details();
		
		System.out.println("Checkout Successful");
	
	}

	@When("click on the checkout button")
	public void click_on_the_checkout_button() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.checkoutbtn();
	
	}

	@Then("user should checkout successfully")
	public void user_should_checkout_successfully() {
		
		System.out.println("Checkout Successful");
	
	}

}
