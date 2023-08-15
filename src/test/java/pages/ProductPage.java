package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

import static org.bouncycastle.crypto.tls.ContentType.alert;
import static org.graalvm.compiler.asm.sparc.SPARCAssembler.Op3s.Add;

public class ProductPage extends BasePage{

    public static final By ADD_TO_CART = By.xpath("//a[text()= 'Add to cart']");
    public ProductPage(WebDriver driver) {

        super(driver);
    }

    @Override
    public boolean isPageOpen() {

        return isExist(ADD_TO_CART);
    }
    public void clickAddToCart(){
        driver.findElement(ADD_TO_CART).click();
    }
    public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent()

}
