package com.practicetestautomation.tests.exceptions;

import com.practicetestautomation.pageobjects.ExceptionsPage;
import com.practicetestautomation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExceptionsTests extends BaseTest {

    @Test
    public void noSuchElementExceptionTest(){
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        Assert.assertTrue(exceptionsPage.isRowTwoDisplayedAfterWait(),"Row2 input is not displayed" );

    }
    @Test
    public void timeoutExceptionTest(){
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        Assert.assertTrue(exceptionsPage.isRowTwoDisplayedAfterWait(),"Row2 input is not displayed" );

    }

    @Test
    public void elementNotInteractableExceptionTest(){
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        exceptionsPage.isRowTwoDisplayedAfterWait();
        exceptionsPage.enterFoorInRowTwo("Sushi");
        exceptionsPage.saveRow2();
        Assert.assertEquals(exceptionsPage.getSuccessMessage(), "Row 2 was saved", "Message is not expected");
    }
    @Test
    public void invalidElementStateExceptionTest(){
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushEditButton();
        exceptionsPage.enterFoorInRowOne("Sushi");
        exceptionsPage.saveRow1();
        Assert.assertEquals(exceptionsPage.getSuccessMessage(), "Row 1 was saved", "Message is not expected");
    }
    @Test
    public void staleElementReferenceExceptionTest(){
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        Assert.assertTrue(exceptionsPage.isInstructionsElementHiddenAfterWait(), "Instruction text is still not displayed");
    }

}

