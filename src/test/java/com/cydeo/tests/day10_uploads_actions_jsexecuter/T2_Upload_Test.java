package com.cydeo.tests.day10_uploads_actions_jsexecuter;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Test {
    /*
    1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
     */

  @Test
    public void upload1(){

      Driver.getDriver().get("https://practice.cydeo.com/upload");

      WebElement chooseFile= Driver.getDriver().findElement(By.id("file-upload"));
      String path="C:\\Users\\gulsa\\Desktop\\Arraylist methods.JPG";

      BrowserUtils.sleep(2);
      chooseFile.sendKeys(path);

      WebElement upload= Driver.getDriver().findElement(By.xpath("//input[@value='Upload']"));
      upload.click();

    WebElement fileUploadedHeader= Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));

      Assert.assertEquals(fileUploadedHeader.getText(),"File Uploaded!","Verification failed");
  }
}
