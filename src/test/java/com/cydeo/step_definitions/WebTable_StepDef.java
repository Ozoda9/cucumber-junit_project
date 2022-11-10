package com.cydeo.step_definitions;

import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class WebTable_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    WebTablePage webTablePage = new WebTablePage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();


    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        Driver.getDriver().get(ConfigReader.getProperty("env"));
        webTableLoginPage.login1();
        webTablePage.orderBox.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select = new Select(webTablePage.productOption);
        select.selectByValue(productType);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        // default there was already number in this input
        // first we need to clean that input and we will send keys later
        // webTableOrderPage.inputQuantity.clear();

        webTablePage.inputQuantity.sendKeys(Keys.BACK_SPACE);

        // accepting int arg and sending text using sendKeys() method
        // since sendKeys() method only accepts String, we need to either concat with ""
        // or send String.valueOf(int)
        //webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));

        webTablePage.inputQuantity.sendKeys(int1+"");


    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
      webTablePage.customerName.sendKeys(name);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
       webTablePage.address.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTablePage.city.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTablePage.state.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webTablePage.zipcode.sendKeys(zipcode);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        BrowserUtils.clickRadioButton(webTablePage.cardType, cardType);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        webTablePage.cardNumber.sendKeys(cardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
        webTablePage.expirationDate.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTablePage.processButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {

        String actualCustomerName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedCustomerName,actualCustomerName);

    }


}
