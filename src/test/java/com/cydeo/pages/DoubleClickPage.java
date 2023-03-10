package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {
    public DoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "accept-choices" )
    public WebElement accept;

    @FindBy(id = "demo")
    public WebElement textToDoubleClick;
}
