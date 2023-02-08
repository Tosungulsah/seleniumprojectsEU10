package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
// 1- initialize the driver instance and object of the class
        public LibraryLoginPage(){ // default contructor
            PageFactory.initElements(Driver.getDriver(), this);


}

}
