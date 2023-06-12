package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MystepsDefinations {
	@Given("^user is in the login page$")
    public void user_is_in_the_login_page() throws Throwable {
       System.out.println("user is in the login page for gmail");
    }

    @When("^user enter valid username and password$")
    public void user_enter_valid_username_and_password() throws Throwable {
       System.out.println("user entered valid username and password");
    }

    @Then("^successfully login should happen$")
    public void successfully_login_should_happen() throws Throwable {
      System.out.println("Logged in sucessfully");
    }

    @And("^clicks on signin button$")
    public void clicks_on_signin_button() throws Throwable {
       System.out.println("user clicked on sigin in button");
    }
    
    @When("^user enter valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_valid_username_as_something_and_password_as_something(String name, String password) throws Throwable {
       System.out.println("user entered username as "+name+" and password as "+password);
    }
}
// hotkey to import all package--->ctlr+shift+o