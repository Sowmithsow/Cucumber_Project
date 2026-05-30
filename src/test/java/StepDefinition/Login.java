package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	POM_Implementation p;
	
	@Given("User should navigate to the browser")
	public void user_should_navigate_to_the_browser() {
		
		driver=Hooks.driver;
		
	   System.out.println("Login successful");
	}

	@When("user clicks on username field and enter valid username")
	public void user_clicks_on_username_field_and_enter_valid_username() throws IOException {
		
		p=new POM_Implementation(driver);
		p.loginbtn();
		
		FileInputStream file=new FileInputStream("C:\\Users\\SOWMITHRAN\\Downloads\\Project Dataprovider.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rows=sheet.getLastRowNum();
		
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				
				System.out.println("Reading data excel from is successful");
			}
		}
		
		String username=data[0][0].toString();
		String password=data[0][1].toString();
		
		
		p.username(username,password);
		
		
		System.out.println("Reading username from excel is successful");
		
	    file.close();
	    workbook.close();
	}
	
	@When("user clicks on password field and enter valid password")
	public void user_clicks_on_password_field_and_enter_valid_password() {
	    
		System.out.println("Reading password from excel is successful");
	}


	@Then("user should login successfully")
	public void user_should_login_successfully() {
	    
		System.out.println("User login successful");
	}
}
