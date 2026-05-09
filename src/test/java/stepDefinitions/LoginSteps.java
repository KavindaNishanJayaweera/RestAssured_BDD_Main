package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	@Given("Base URL")
	public void base_URL() {
	   LoginPage.optionbrowser();
	}

	@When("Enter user name {string}")
	public void enter_user_name(String username) {
		LoginPage.method_enterUserName(username);
	}

	@When("Enter password {string}")
	public void enter_password(String string) {
		LoginPage.method_enterUserName_isDisplayed();
	}

	@When("Click OK button")
	public void click_OK_button() {
		LoginPage.method_ClickOkButton();
	}

	@Then("Verify the dashboard page title")
	public void verify_the_dashboard_page_title() {
		LoginPage.method_ClickOkButton_Clear();
	}


	
	@Given("Text field")
	public void text_field() {
		
	}

	@When("Enter test {string}")
	public void enter_test(String string) {
	//	LoginPage.method_enterUserName_Fail(string);
	}

	
	@Then("Verify the text field")
	public void verify_the_text_field() {
		LoginPage.method_enterUserName_isDisplayed();
	}

}
