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
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    //home page validation
    	System.out.println("homepage validated");
    }
    @When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
       System.out.println(arg2);
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String arg1) throws Throwable {
System.out.println(arg1);   
}
    }

