package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filterproduct {
	
	WebDriver driver;
	POM_Implementation p;
	
	@Given("user clicks on  search and enters valid product name")
	public void user_clicks_on_search_and_enters_valid_product_name() {
		
		driver=Hooks.driver;
	    
		p=new POM_Implementation(driver);
		
		p.searchclick();
		
		p.searchbtn();
	}

	@When("apply filters to the product")
	public void apply_filters_to_the_product() {
		
		p=new POM_Implementation(driver);
		
		p.filters();
	}

	@Then("Filters should be applied on the product")
	public void filters_should_be_applied_on_the_product() {
		
		System.out.println("Filters applied successfully");
	    
	}
}
