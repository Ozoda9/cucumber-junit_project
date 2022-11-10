package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearPage.usernameBox.sendKeys("Tester");
        smartBearPage.passwordBox.sendKeys("test");
        smartBearPage.loginButton.click();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        System.out.println("Filling out the form");
        smartBearPage.order.click();

}
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBearPage.productDropdown);
        select.selectByValue(string);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantityBox.sendKeys(string);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
      smartBearPage.customerName.sendKeys(string);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetBox.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.cityBox.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
       smartBearPage.stateBox.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
       smartBearPage.zipCodeBox.sendKeys(string);
    }
    @When("User selects Visa as card type")
    public void user_selects_as_card_type() {
       smartBearPage.visaButton.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumberBox.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expirationDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        smartBearPage.viewAllOrders.click();
        String result = smartBearPage.JohnWickBox.getText();
        Assert.assertTrue(result.contains(string));
    }
}
