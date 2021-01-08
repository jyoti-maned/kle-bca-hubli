package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.GoogleHomePage;

public class StepDefn {
    private GoogleHomePage homePage = new GoogleHomePage();
    @Given("I open Google page")
    public void iOpenGooglePage() {
        homePage.openPage();
    }

    @When("I enter Cheese Cake on search bar")
    public void iEnterCheeseCakeOnSearchBar() {
        homePage.loginPwd();
    }

    @Then("List of search results")
    public void listOfSearchResults() {
    }
}
