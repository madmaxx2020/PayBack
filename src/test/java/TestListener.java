import core.AppiumDriverConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Optional;

public class TestListener implements TestWatcher {

    private AppiumDriver<MobileElement> driver = AppiumDriverConfig.getDriver();

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        takeScreenShot();
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        takeScreenShot();
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        takeScreenShot();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        takeScreenShot();
    }

    private void takeScreenShot() {
        Allure.getLifecycle().addAttachment(
                "Screenshot",
                "image/png",
                "png",
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        driver.quit();
        driver.close();
    }
}