package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class LoginPage extends BasePage {
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "de.payback.client.android:id/welcome_loginbutton")
    private MobileElement loginButton;

    public LoginPage clickLoginButton() {
        element(loginButton).clickElement();
        return new LoginPage(driver);
    }

}
