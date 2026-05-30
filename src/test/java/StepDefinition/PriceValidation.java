package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceValidation {
	
	WebDriver driver;
	
	POM_Implementation p;
	
	@Given("User select the product and clicks add to cart button")
	public void user_select_the_product_and_clicks_add_to_cart_button() throws InterruptedException {
		
		driver=Hooks.driver;
		
		p=new POM_Implementation(driver);
		
		p.searchclick();
		
		Thread.sleep(3000);
		
		p.searchbtn();
		
        Thread.sleep(3000);
		
		p.addcart();
	
	}

	@When("user clicks on the shopping cart button")
	public void user_clicks_on_the_shopping_cart_button() throws InterruptedException {
		
		POM_Implementation p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.shopcartbtn();
		
	}

	@When("clicks the product")
	public void clicks_the_product() throws InterruptedException {
		
		POM_Implementation p=new POM_Implementation(driver);
		
		Thread.sleep(3000);
		
		p.smartphone();

	}

	@Then("product amount should be displayed")
	public void product_amount_should_be_displayed() throws InterruptedException {
		
		Thread.sleep(3000);
		
		POM_Implementation p=new POM_Implementation(driver);
		
		p.getprice();
		
		System.out.println("Product price is displayed");
	
	}

}
