package com.app.test;

import com.app.pages.DocumentationPage;
import com.app.pages.DownloadsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRunner {
    DownloadsPage downloadsPage;
    DocumentationPage documentationPage;
    private static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        downloadsPage = new DownloadsPage(driver);
        documentationPage = new DocumentationPage(driver);

        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    @Test
    public void verifyDownloadsPage(){
        downloadsPage.launchDownloads();
        downloadsPage.verifyDownloadHeader();

    }
    @Test
    public void verifyDocumentsPage(){
        documentationPage.launchDocumentation();
        documentationPage.verifyDocumentationHeader();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
