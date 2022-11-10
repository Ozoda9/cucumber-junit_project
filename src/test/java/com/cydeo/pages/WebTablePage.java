package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablePage {

     public WebTablePage(){
         PageFactory.initElements(Driver.getDriver(), this);
     }

     @FindBy(xpath="//button[.='Order']")
    public WebElement orderBox;

     @FindBy(xpath = "//select[@name='product']")
    public WebElement productOption;

     @FindBy(xpath="//input[@placeholder='Enter amount desired']")
    public WebElement quantityBox;

     @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerName;

     @FindBy(xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement address;

     @FindBy(xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city;

     @FindBy(xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state;

     @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipcode;

    @FindBy  (xpath = "//input[@name='card']")
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement expirationDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processButton;

    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement nameInTheRow;

    @FindBy(name="quantity")
    public WebElement inputQuantity;

}
