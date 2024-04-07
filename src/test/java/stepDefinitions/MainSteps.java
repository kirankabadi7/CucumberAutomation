package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("user is on Netbanking login page")
	public void user_is_on_netbanking_login_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user login into the applciation with username {string} and password {string}")
	public void user_login_into_the_applciation_with_username_and_password(String un, String pwd) {
		System.out.println("Username and password are : " + un + "And " + pwd);
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("cards are dispalyed")
	public void cards_are_dispalyed() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user login into the applciation with filling in the form data")
	public void user_login_into_the_applciation_with_filling_in_the_form_data(List<String> data) {
		System.out.println("Value for forms is : " + data.get(0));
		System.out.println("Value for forms is : " + data.get(1));
		System.out.println("Value for forms is : " + data.get(2));
		System.out.println("Value for forms is : " + data.get(3));
	}
}
