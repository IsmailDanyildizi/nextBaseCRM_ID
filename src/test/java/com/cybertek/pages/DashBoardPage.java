package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

    @FindBy(css = "#feed-add-post-form-link-more")
    public WebElement moreBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-form-link']/span[.='Task']")
    public WebElement taskButton;

    @FindBy(xpath = "//span[text() = 'Task']")
    public WebElement taskBtn;

    @FindBy(id = "LIVEFEED_search")
    public WebElement serchModule;

    @FindBy(xpath = "(//*[.='Work'])[2]")
    public WebElement workButton;

    @FindBy(xpath = "//*[.='Favorites']")
    public WebElement workFavorites;

    @FindBy(xpath = "//*[.='My Activity']")
    public WebElement workMyActivity;

    @FindBy(xpath = "(//*[.='Announcements'])[2]")
    public WebElement workAnnouncements;

    @FindBy(xpath = "(//*[.='Workflows'])[3]")
    public WebElement workWorkflows;

    @FindBy(xpath = "(//*[.='Any date'])[3]")
    public WebElement anyDate;

    @FindBy(xpath = "(//*[.='Current day'])[2]")
    public WebElement selectcurrentDay;

    @FindBy(css = ".main-ui-item-icon.main-ui-square-delete")
    public WebElement deleteCurrentDay;

    @FindBy(xpath = "//*[@*='EVENT_ID']")
    public WebElement selectType;

    @FindBy(xpath ="(//*[.='Announcements'])[4]")
    public WebElement selectAnnouncements;

    @FindBy(xpath = "//*[@*='CREATED_BY_ID_label']")
    public WebElement selectAuthor;

    @FindBy(css = "#TO_label")
    public WebElement selectTo;

    @FindBy(xpath = "(//*[@*='bx-finder-box-item-t7-name'])[1]")
    public WebElement selectOnePeople;

    @FindBy(xpath = "//*[.='Add field']")
    public WebElement addFilter;

    @FindBy(xpath = "(//*[.='Favorites'])[3]")
    public WebElement clickFavorites;

    @FindBy(xpath = "//*[@*='main-ui-filter-add-item']")
    public WebElement saveFilter;

    @FindBy(xpath = "//*[@*='main-ui-filter-sidebar-edit-control']")
    public WebElement addNewFilterName;

    @FindBy(xpath = "//*[@*='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveNewFilter;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;


}
