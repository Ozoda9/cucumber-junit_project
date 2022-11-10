package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTitleVerification {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("User is on the etsy website")
    public void user_is_on_the_etsy_website() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("User should see title as expected")
    public void user_should_see_title_as_expected() {

        String actual = Driver.getDriver().getTitle();
        String expected = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(expected,actual);

    }

    @When("User types Wooden Spoon in the search box and clicks search button")
    public void user_types_wooden_spoon_in_the_search_box() {
       etsySearchPage.searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        Assert.assertTrue("Title does not contain that", Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("User types {string} in the search box and clicks search button")
    public void user_types_in_the_search_box_and_clicks_search_button(String searchKeyword) {
        etsySearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

}
