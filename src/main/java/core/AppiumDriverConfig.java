package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {

    static AppiumDriver<MobileElement> driver;

    private static DesiredCapabilities setCapabilities() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesConfig.getProperty("deviceName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertiesConfig.getProperty("platformName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, PropertiesConfig.getProperty("platformVersion"));
        cap.setCapability(MobileCapabilityType.UDID, PropertiesConfig.getProperty("udid"));
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, PropertiesConfig.getProperty("AutomationName"));
        cap.setCapability(MobileCapabilityType.APP, "D:\\from MACK-BOOK\\Projects\\PayBack\\src\\main\\resources\\PAYBACK_22.08.0900.apk");
        cap.setCapability(MobileCapabilityType.FULL_RESET, true);
        cap.setCapability("appPackage", PropertiesConfig.getProperty("AppPackage"));
        cap.setCapability("appActivity", PropertiesConfig.getProperty("AppActivity"));
        return cap;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {
            driver = initAppiumDriver();
        }
        return driver;
    }

    public static AppiumDriver<MobileElement> initAppiumDriver() {
        DesiredCapabilities androidCapabilities = setCapabilities();
        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), androidCapabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }

    public static void quiteApp() {
        if (driver != null) {
            driver.closeApp();
        }
    }
}