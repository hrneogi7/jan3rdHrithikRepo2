package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadsPage {
    private static WebDriver driver;
    public DownloadsPage(WebDriver driver){
        this.driver = driver;
    }
    public void launchDownloads(){

        String expectedTitle = "Downloads | Selenium";
        driver.findElement(By.linkText("Downloads")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,expectedTitle,"Downloads page is not loaded");
    }
    public void verifyDownloadHeader(){
        String expectedHeader = "Downloads";
        String pageHeader = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(pageHeader,expectedHeader,"Download header is not correct");
    }
}
