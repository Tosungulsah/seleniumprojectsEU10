package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic_Load1 {
    public Dynamic_Load1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(css = "input#username")
    public WebElement userInput;

    @FindBy(css = "input#pwd")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement errorMessage;
}
