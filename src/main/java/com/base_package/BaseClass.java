package com.base_package;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class BaseClass {
    public static WebDriver driver;

    public static void selectByIndex(WebElement element, int index)

    {
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void screenshot (WebDriver driver, String path) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File(path);
        FileUtils.copyFile(src, des);
    }



}
