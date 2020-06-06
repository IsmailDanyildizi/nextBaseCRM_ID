package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#user-name")
    public WebElement usernameMenu;

    @FindBy(xpath = "(//a[@class = 'menu-popup-item menu-popup-no-icon '])[3]")
    public WebElement logoutBtn;

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(usernameMenu);
        BrowserUtils.clickWithJS(logoutBtn);
    }
}
