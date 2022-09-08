package pages.authorizationPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/welcome_loginbutton")
    private MobileElement loginButton;

    public boolean loginButtonDisplayed(){
        return  element(loginButton).isDisplayed();
    }

    public LoginPage clickLoginButton() {
        element(loginButton).clickElement();
        return new LoginPage(driver);
    }
    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
