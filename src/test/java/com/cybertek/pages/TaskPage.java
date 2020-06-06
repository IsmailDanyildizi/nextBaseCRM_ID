package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TaskPage extends BasePage {

    // ICON LOCATORS

    @FindBy(css = "#lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorIcon;

    @FindBy(css = "#bx-b-uploadfile-task-form-lifefeed_task_form")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "(//span[@title = 'Quote text']/i)[2]")
    public WebElement quoteIcon;

    @FindBy(css = "#bx-b-mention-task-form-lifefeed_task_form")
    public WebElement addMentionIcon;

    @FindBy(xpath = "(//span[@title= 'Link'])[2]")
    public WebElement linkIcon;

    @FindBy(xpath = "//span[@class = 'tasks-task-mpf-link'][text() = 'Checklist']")
    public WebElement checklistBtn;

    @FindBy(xpath = "//a[@href='javascript:void(0);'][contains(. , 'Add more')]")
    public WebElement addMoreBtn;




    @FindBy(css = "#tasks-task-priority-cb")
    public WebElement highPriorityCheckBox;

    @FindBy(xpath = "//input[@name = 'ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement thingsToDoInputBox;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//button[@id = 'blog-submit-button-cancel'][1]")
    public WebElement cancelBtn;

    @FindBy(css = "#bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement visualEditorBar;

    @FindBys({
            @FindBy(className = "diskuf-uploader"),
            @FindBy(xpath = "//input[@name = 'bxu_files[]']")
    })
    public WebElement uploadFilesNImagesBtn;

    @FindBy(xpath = "(//span[. = 'Select document from Bitrix24'])[5]")
    public WebElement selectDocFromBitrix24Btn;

    @FindBy(xpath = "(//span[. = 'Download from external drive'])[5]")
    public WebElement downloadFromExternalDriveBtn;

    @FindBy(xpath = "(//span[. = 'Cancel'])[2]")
    public WebElement cancelPopup;

    @FindBy(xpath = "//span[@class = 'popup-window-button'][text() = 'Close']")
    public WebElement closePopup;

    @FindBy(xpath = "//blockquote/br")
    public WebElement quoteTextBox;

    @FindBy(css = "a[id^='destDepartmentTab_mention']")
    public WebElement mentionEmpNDep;

    @FindBy(xpath = "//input[@id = 'linklifefeed_task_form-text' and @placeholder = 'Link text']")
    public WebElement linkText;

    @FindBy(css = "#linklifefeed_task_form-href")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@type = 'button' and @value = 'Save']")
    public WebElement linkSaveBtn;

    @FindBy(xpath = "(//input[@placeholder = 'Things to do'])[2]")
    public WebElement checklistThingsToDoTextBox;

    @FindBy(xpath = "//span[. = 'add']")
    public WebElement checklistAddBtn;

    @FindBy(xpath = "(//input[starts-with(@id, 'chl_item_')])[1]")
    public WebElement checklistCheckbox;

    @FindBy(xpath = "(//span[. = 'separator'])[2]")
    public WebElement checklistSeparatorBtn;

    @FindBy(xpath = "//span[contains(@class, 'js-id-checklist-is-i-delete')][contains(@class, 'task-field-title-del')][contains(@class, 'tasks-btn-delete')]")
    public WebElement checklistItemDelete;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(. , 'Recent')]")
    public WebElement addMentionRecent;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(. , 'Employees and departments')]")
    public WebElement addMentionEmpNDep;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(. , 'E-mail users')]")
    public WebElement addMentionEmailUsers;

    @FindBy(xpath = "//span[@class = 'popup-window-close-icon']")
    public WebElement addMentionClosePopup;


    // these locators are the links under "Download from external drive" button

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'Box']")
    public WebElement boxLink;

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'Dropbox']")
    public WebElement dropboxLink;

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'Google Drive']")
    public WebElement googleDriveLink;

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'Office 365']")
    public WebElement office365Link;

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'OneDrive']")
    public WebElement oneDriveLink;

    @FindBy(xpath = "//span[@class = 'bx-file-dialog-tab-item-link-text'][@title = 'Yandex.Disk']")
    public WebElement yandexDiskLink;


    // these are the locators under "Create using Desktop applications" button

    @FindBy(xpath = "(//span[@class = 'wd-fa-add-file-editor-link'][text() = 'Document'])[5]")
    public WebElement documentLink;

    @FindBy(xpath = "(//span[@class = 'wd-fa-add-file-editor-link'][text() = 'Spreadsheet'])[5]")
    public WebElement spreadsheetLink;

    @FindBy(xpath = "(//span[@class = 'wd-fa-add-file-editor-link'][text() = 'Presentation'])[5]")
    public WebElement presentationLink;


    // these are the locators under "Select document from Bitrix24" button

    @FindBy(xpath = "//a[. = '4.png']")
    public WebElement fileSelectDocFromBitrix24;


}
