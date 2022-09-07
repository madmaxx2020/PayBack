package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.TimeoutException;

public class MobileElementActions extends MobileElement{

    private AppiumDriver<MobileElement> driver;
    private Waiters waiters;
    private MobileElement mobileElement;

    public MobileElementActions(AppiumDriver<MobileElement> driver, Waiters waiters, MobileElement mobileElement) {
        this.driver = driver;
        this.waiters = waiters;
        this.mobileElement = mobileElement;
    }

    public MobileElementActions() {
    }

    public void clickElement() {
        waiters.waitForClickable(mobileElement).click();
    }

    public boolean isDisplayed() {
        try {
            return waiters.waitForVisibility(mobileElement).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}
