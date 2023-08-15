package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    final String URL = "https://www.demoblaze.com/";
    public BasePage (WebDriver driver){

        this.driver = driver;
    }


    public boolean isExist(By locator){
        try
        {return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
}

    public abstract boolean isPageOpen();
}

