package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchProduct {
	
	WebDriver driver;
	
	POM_Implementation p;
	
	@Given("When user enter valid product name")
	public void when_user_enter_valid_product_name() {
		
		driver=Hooks.driver;
		
		p=new POM_Implementation(driver);
	    
		p.searchclick();
		
		System.out.println("Searching product is successful");
	}

	@Given("click on search button")
	public void click_on_search_button() {
	    
		p=new POM_Implementation(driver);
		
		p.searchbtn();
	}

	@Then("product should be displayed")
	public void product_should_be_displayed() {
	  System.out.println("Product display successful");
	}


}
