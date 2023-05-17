package org.example;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static void selectOptionByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    public static void selectOptionByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void selectOptionByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new
                SimpleDateFormat("ddmmyyhhmmss");
        return sdf.format(date);

    }
    public static void captureScreenshot (String fileName){
        //convert Web driver object to TakeScreenshot
        TakesScreenshot takesScreenshot =((TakesScreenshot) driver);
        //call get screenshotAs method to create image file
        File
                SrcFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        File destfile=new
                File(("src\\test\\Screenshots\\"+fileName+""+currentTimeStamp()+".png"));
        //copy file destination
        try{
            FileUtils.copyFile(SrcFile,destfile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
