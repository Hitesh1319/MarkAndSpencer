package MarkSpencer.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideButtonOfHomePage {
    WebDriver driver;

    By leftSliderButtonOfImage= By.xpath("(//button[@type='button'])[1]");
    public SideButtonOfHomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void leftSliderButtonOfImage(){
        driver.findElement(leftSliderButtonOfImage).click();
    }
}
