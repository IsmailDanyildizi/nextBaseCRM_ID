package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class FilePage extends BasePage {


    @FindBy (xpath = "(//*[text()='File'])[2]")
    public WebElement FileBtn;

    @FindBys({
            @FindBy(className = "diskuf-uploader"),
            @FindBy(xpath = "//input[@name = 'bxu_files[]']")
    })
    public WebElement ClickUplodFilesandImages;

    @FindBy(css = "span.insert-btn-text")
    public WebElement insertInText;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy (xpath = "(//span[.='Download from external drive'])[1]")
    public WebElement externaldriver;

    @FindBy(css = ".ui-notification-balloon-message")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selecktDocfromBitrix24;

    @FindBy(css = ".bx-file-dialog-content-link.bx-file-dialog-icon.bx-file-dialog-icon-file")
    public WebElement sentFile;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectDocButton;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-editor-text'])[1]")
    public WebElement createUsing;

    @FindBy(css = ".menu-popup-item.bx-viewer-popup-item.item-office365 ")
    public WebElement officeButton;

    @FindBy(xpath = "(//span[.='Presentation'])[1]")
    public WebElement presentation;

    @FindBy(css = "span#error-text")
    public WebElement notConfiguredMessage;


}
