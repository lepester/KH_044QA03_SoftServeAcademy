package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class RozetkaDisplaysPage extends BasePage {
    @FindBy(css = "a.goods-tile__picture")
    private WebElement display;

    public RozetkaDisplaysPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        display.isDisplayed();
    }
}