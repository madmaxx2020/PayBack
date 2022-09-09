package pages.authorizationPages;

import core.PropertiesConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import pages.BasePage;

public class CardNumberPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/txtLoginCheckCardNumber")
    private MobileElement inputNumberField;

    @AndroidFindBy(id = "de.payback.client.android:id/progressbutton_btn")
    private MobileElement confirmButton;

    @Step("Set exist card number")
    public CardNumberPage setCardNumber() {
        element(inputNumberField).inputValue(PropertiesConfig.getProperty("cardNumber"));
        return new CardNumberPage(driver);
    }

    @Step("Confirm card number")
    public CardNumberPage clickConfirmButton() {
        element(confirmButton).clickElement();
        return new CardNumberPage(driver);
    }

    public CardNumberPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
