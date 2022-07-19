package stepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	//code to navigate to login url
    	System.out.println("navigated to login url");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	//code to login
    	System.out.println("logged in successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    //home page validation
    	System.out.println("homepage validated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//validating the cards
    	System.out.println("card validated");
    }

}