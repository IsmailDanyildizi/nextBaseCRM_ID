package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Arrays;

public class AnnouncementPage extends BasePage{
    @FindBy(xpath = "//*[. = 'Announcement']")
    public WebElement annuncementBtn;

    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//input[@name = 'bxu_files[]']")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "//input[@name = 'bxu_files[]']")
    public WebElement uploadedFilesAndImagesName;

    @FindBy(css = ".files-path")
    public WebElement visibleAfterUploading;

    public String getUploadedFilesAndImagesName(){
        String[] split = Driver.get().findElement(By.className("f-wrap")).getText().split("\\(");
        String[] split1 = Driver.get().findElement(By.className("f-wrap")).getText().split("\\.");

        return split[0].trim()+"."+split1[1] ;
    }
    public String getexpectedFileName(){
        String[] split = getFilePath().split("resources/");
        return split[1] ;
    }
    public String getFilePath(){
        String projectPath = System.getProperty("user.dir");
        String relativePath = ConfigurationReader.get("relativePathforuploadingtest");
        return projectPath + "/" + relativePath;
    }


}
