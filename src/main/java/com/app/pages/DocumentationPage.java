package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentationPage {
    private static WebDriver driver;
    public DocumentationPage(WebDriver driver){
        this.driver = driver;
    }
    public void launchDocumentation(){
        String expectedTitle = "The Selenium Browser Automation Project | Selenium";
        driver.findElement(By.linkText("Documentation")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,expectedTitle,"Documentation page is not loaded");
    }

    public void verifyDocumentationHeader(){
        String expectedHeader = "Documentation";
        String pageHeader = driver.findElement(By.id("m-documentation")).getText();
        Assert.assertEquals(pageHeader,expectedHeader,"Documentation header is not correct");
    }
}
