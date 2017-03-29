package com.il.mo.co.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class SubmitNewIssueTest extends AbstractTestCase {
   
    @Test( enabled = true)
    public void testDragAndDrop() {
    	
    	By dragItem = By.cssSelector("div.btn.btn-primary");
        By droppable = By.cssSelector("div.thumbnail");
        
        WebElement drago= driver.findElement(dragItem);
        WebElement drapo=  driver.findElement(droppable);
        
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(droppable));
        
        (new Actions(driver)).dragAndDrop(drago, drapo).build().perform();
        
        
        try{Thread.sleep(5000);}catch(Exception e){}
    	
    	
    }

   

 
    
  
}