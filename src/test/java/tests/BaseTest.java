package tests;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.ProductPage;

import java.util.concurrent.TimeUnit;

@Log4j2

public class BaseTest {

    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    PlaceOrderPage placeOrderPage;
@Step("Настройка и открытие браузера")
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        placeOrderPage = new PlaceOrderPage(driver);

    }
@Step("Закрытие браузера")
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}



