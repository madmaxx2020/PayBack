package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Waiters {

    private final long IMPLICITLY_WAIT = 15L;
    private final long EXPLICITLY_WAIT = 5L;

    private AppiumDriver<MobileElement> driver;

    public Waiters(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public Waiters() {
    }

    private FluentWait<AppiumDriver<MobileElement>> waiter() {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(IMPLICITLY_WAIT))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }

    public MobileElement waitForClickable(MobileElement by) {
        return (MobileElement) waiter().until(elementToBeClickable(by));
    }

    public MobileElement waitForVisibility(MobileElement mobileElement) {
        return (MobileElement) waiter().until(ExpectedConditions.visibilityOf(mobileElement));
    }
}
