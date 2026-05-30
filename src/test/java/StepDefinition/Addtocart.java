package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocart {
	
	WebDriver driver;
	POM_Implementation p;
	
	@Given("user searches for a product")
	public void user_searches_for_a_product() {
		
		driver=Hooks.driver;
		
		p=new POM_Implementation(driver);
		
		p.searchclick();
	
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.searchbtn();	

	}

	@When("user applies filters to the product")
	public void user_applies_filters_to_the_product() throws InterruptedException {
		
		Thread.sleep(3000);
		
		p=new POM_Implementation(driver);
		
		p.filters();
	
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		
		p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.addcart();
	
	}

	@Then("product should be added to cart successfully")
	public void product_should_be_added_to_cart_successfully() {
	   
		System.out.println("Product added to cart");
	}	
}
