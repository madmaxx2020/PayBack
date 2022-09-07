package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.MobileElementActions;
import utils.Waiters;

import java.time.Duration;

public class BasePage {

    protected static AppiumDriver<MobileElement> driver;
    private Waiters waiters;

    public BasePage(){
    }
    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(3)), this);
        waiters = new Waiters(driver);
    }

    public MobileElementActions element(MobileElement mobileElement) {
        return new MobileElementActions(driver, waiters, mobileElement);
    }
}
