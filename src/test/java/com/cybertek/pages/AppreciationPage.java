package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class AppreciationPage extends BasePage {

    @FindBy(xpath = "//*[text() = 'Appreciation']")
    public WebElement appreciationBtn;

    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBys({
            @FindBy(className = "diskuf-uploader"),
            @FindBy(xpath = "//input[@name = 'bxu_files[]']")
    })
    public WebElement uploadFilesAndImages;

    @FindBy(css = "span.insert-btn-text")
    public WebElement insertInText;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selDocumentFrom;

    @FindBy(css = ".bx-file-dialog-content-link.bx-file-dialog-icon.bx-file-dialog-icon-file")
    public WebElement sentFile;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectDocButton;

    @FindBy(xpath = "(//span[.='Download from external drive'])[1]")
    public WebElement externalDriver;

    @FindBy(css = ".ui-notification-balloon-message")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-editor-text'])[1]")
    public WebElement createUsing;

    @FindBy(css = ".menu-popup-item.bx-viewer-popup-item.item-office365 ")
    public WebElement officeButton;

    @FindBy(xpath = "(//span[.='Presentation'])[1]")
    public WebElement presentation;

    @FindBy(css = "span#error-text")
    public WebElement notConfiguredMessage;

    @FindBy(css = "span.feed-add-post-destination-text")
    public WebElement toInputBox;

    @FindBy(css = "a[id^='destDepartmentTab_destination']")
    public WebElement empAndDep;

    @FindBy(xpath = "//span[@title='Topic']")
    public WebElement topic;

    @FindBy(id = "POST_TITLE")
    public WebElement topicInputBox;

    @FindBy(css = ".popup-window-close-icon")
    public WebElement closeIcon;

    @FindBy(css = "#feed-add-post-grat-input")
    public WebElement recipientInputBox;

    @FindBy(xpath = "//span[@title='Link']/i")
    public WebElement linkIcon;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement textInputBox;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(css = "#undefined")
    public WebElement save;

    @FindBy(xpath = "//span[@title='Insert video']/i")
    public WebElement videoIcon;

    @FindBy(css = "#video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSource;

    @FindBy(xpath = "//span[@title='Quote text']/i")
    public WebElement quoteIcon;

    @FindBy(xpath = "//blockquote")
    public WebElement blockquote;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionIcon;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement recentContact;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement visualEditorIcon;

    @FindBy(css = "div[class='bx-html-editor']>div>div.bxhtmled-toolbar")
    public WebElement visualEditorBar;

    @FindBy(xpath = "//span[@id='bx-b-tag-input-blogPostForm']/following-sibling::span")
    public WebElement recordVideoIcon;

    @FindBy(xpath = "//span[.='Allow']")
    public WebElement allowButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement errorMessageWindow;

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTag;

    @FindBy(css = "input[name='TAGS_blogPostForm']")
    public WebElement addTagWindow;

    @FindBy(css = ".popup-window-button")
    public WebElement addButton;

    @FindBy(css = "#feed-add-post-grat-type-selected>span")
    public WebElement thumbsUp;



    public List<WebElement> contactList() {
        List<WebElement> list = Driver.get().findElements(By.cssSelector(".bx-finder-company-department-employee.bx-finder-element"));

        return list;
    }

    public void addContact(int numberOfContact) {
        for (int i = 0; i < numberOfContact; i++) {
            contactList().get(i).click();
        }
    }

    public WebElement selectEmoji(String name){
       // .feed-add-grat-list>div>span[title=Cake]
        List<WebElement> elements = Driver.get().findElements(By.cssSelector(".feed-add-grat-list>div>span"));

        for (WebElement emoji : elements) {
            if (emoji.getAttribute("title").equals(name)){
                return emoji;
            }
        }

        return null;

    }


}
