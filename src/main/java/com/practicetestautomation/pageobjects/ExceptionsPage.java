package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionsPage extends BasePage{
    //Below are my private elements for my develop branch
    private By addButtonLocator = By.id("add_btn");
    private By editButtonLocator = By.id("edit_btn");
    private By row1InputField = By.xpath("//div[@id='row1']/input");
    private By row2InputField = By.xpath("//div[@id='row2']/input");
    private By row1SaveButton = By.xpath("//div[@id='row1']/button[@name='Save']");
    private By row2SaveButton = By.xpath("//div[@id='row2']/button[@name='Save']");
    private By successMessage = By.id("confirmation");
    private By instructionsLocator = By.id("instruction");

    public ExceptionsPage(WebDriver driver){
        super(driver);
    }
    public void visit(){
        super.visit("https://practicetestautomation.com/practice-test-exceptions/");
    }
    public void pushAddButton(){
        driver.findElement(addButtonLocator).click();
    }
    public void pushEditButton(){
        driver.findElement(editButtonLocator).click();
    }
    public boolean isRowTwoDisplayedAfterWait(){
        return waitForIsDisplayed(row2InputField);
    }
    public void enterFoorInRowOne(String name){
        WebElement row1Input= driver.findElement(row1InputField);
        row1Input.clear();
        row1Input.sendKeys(name);
    }
    public void enterFoorInRowTwo(String name){
       driver.findElement(row2InputField).sendKeys(name);
    }
    public void saveRow1(){
        driver.findElement(row1SaveButton).click();
    }

    public void saveRow2(){
        driver.findElement(row2SaveButton).click();
    }
    public String getSuccessMessage(){
        return waitForElement(successMessage).getText();
    }
    public boolean isInstructionsElementHiddenAfterWait(){
        return waitForIsHidden(instructionsLocator);
    }
}
