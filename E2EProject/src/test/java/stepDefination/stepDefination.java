package stepDefination;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefination extends base{


@Given("Intialize the browser with chrome")
public void intialize_the_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();

	
	}
@Given("Navigate to {string} Site")
public void navigate_to_site(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);

	}
@Given("Click on login link in home page to land on Secure sign in page")
public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		LoginPage lp=l.getLogin();
	}
@When("^user enters (.+) and (.+) and logs in$")
public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
	   lp.getLogin().click();
	}
@Then("verify that user is succesfully logged in")
public void verify_that_user_is_succesfully_logged_in(){
	    // Write code here that turns the phrase above into concrete actions
		PortalHomePage ph=new PortalHomePage(driver);
		Assert.assertTrue(ph.getSearchBox().isDisplayed());
	}
@And("^close browsers$")
public void close_browsers() throws Throwable {
	driver.quit();
}



    }


