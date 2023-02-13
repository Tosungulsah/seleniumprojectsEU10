package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic_Title {
    /// 1/ Create Constructor and instantiate driver and object of the class
    public Dynamic_Title(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement image;
}
