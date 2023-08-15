package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    private final static By HOME_TAB = By.xpath("//a[text()='CATEGORIES']");


    public HomePage(WebDriver driver) {

        super(driver);
    }
    public void getProductFromList(){
        List<WebElement>List=driver.findElements(By.xpath("//h4[@class='card-title]/a"));
        List.get(0).click();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(HOME_TAB);
    }



    public HomePage open(){
        driver.get(URL);
        return this;
    }}

