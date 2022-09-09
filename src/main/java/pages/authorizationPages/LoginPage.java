package pages.authorizationPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import pages.BasePage;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/welcome_loginbutton")
    private MobileElement loginButton;

    @Step("Check Login button")
    public boolean loginButtonDisplayed() {
        return element(loginButton).isDisplayed();
    }

    @Step("Login with exist account")
    public void clickLoginButton() {
        element(loginButton).clickElement();
    }

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
