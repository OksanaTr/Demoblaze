package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage{
    public static final By MODAL_TITLE = By.xpath("//h5[text() = 'Place order']");
    String input = "//input[@id = 'name']";

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
