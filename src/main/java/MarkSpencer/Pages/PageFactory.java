package MarkSpencer.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private DropdownHover dropdownHover;
    private HomePage homePage;
    private SideButtonOfHomePage sideButtonOfHomePage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public DropdownHover getDropdownHover() {
        if (dropdownHover == null) {
            dropdownHover = new DropdownHover(driver);
        }
        return dropdownHover;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public SideButtonOfHomePage getSideButtonOfHomePage() {
        if (sideButtonOfHomePage == null) {
            sideButtonOfHomePage = new SideButtonOfHomePage(driver);
        }
        return sideButtonOfHomePage;
    }
}