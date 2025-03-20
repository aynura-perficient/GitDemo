package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfullLoginPage extends BasePage{
        private By logOutButtonLocator = By.linkText("Log out");

        public SuccessfullLoginPage(WebDriver driver){
           super(driver);
           System.out.println("This is test");
        }

    public boolean isLoutButtonDisplayed(){
          return isDisplayed(logOutButtonLocator);
    }

    public void load(){
            waitForElement(logOutButtonLocator);
    }
}
