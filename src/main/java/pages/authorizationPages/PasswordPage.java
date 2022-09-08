package pages.authorizationPages;

import core.PropertiesConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class PasswordPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/login_password_field")
    private MobileElement inputPasswordField;

    @AndroidFindBy(id = "de.payback.client.android:id/progressbutton_btn")
    private MobileElement passwordOKButton;

    public PasswordPage setPassword() {
        element(inputPasswordField).inputValue(PropertiesConfig.getProperty("password"));
        return this;
    }

    public PasswordPage clickPasswordOKButton() {
        element(passwordOKButton).clickElement();
        return new PasswordPage(driver);
    }

    public PasswordPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
