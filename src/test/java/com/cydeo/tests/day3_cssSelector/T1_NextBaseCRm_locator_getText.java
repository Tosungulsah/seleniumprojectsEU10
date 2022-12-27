package com.cydeo.tests.day3_cssSelector;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_NextBaseCRm_locator_getText {
    public static void main(String[] args) throws InterruptedException {
       /*

TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 PS: Inspect and decide which locator you should be using to locate web
elements.
        */


        //WebDriverManager.chromedriver().setup();

       // WebDriver driver= new ChromeDriver();
       WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");

        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("ggg@gmail.com"+ Keys.TAB);

        Thread.sleep(2000);
        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("djdjdjd"+Keys.ENTER);

        Thread.sleep(2000);

        WebElement errorMessage= driver.findElement(By.className("errortext"));
        String actualErrorMessage= errorMessage.getText();

        String expectedErrorMessage= "Incorrect login or password";
        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification passed");
        }else{
            System.out.println("Error message verification failed");
        }
    // extra placeholder using attribute
        String placeHolderLogin = driver.findElement(By.name("USER_LOGIN")).getAttribute("placeholder");
        System.out.println("placeHolderLogin = " + placeHolderLogin);



    }
}
