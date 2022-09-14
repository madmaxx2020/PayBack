package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class FilterPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Filter']")
    private MobileElement titleFilter;

    @AndroidFindBy(xpath = "(//*[@resource-id='de.payback.client.android:id/image'])[3]")
    private MobileElement partner;

    @AndroidFindBy(id = "de.payback.client.android:id/not_activated_button")
    private MobileElement activateCouponButton;

    @AndroidFindBy(id = "de.payback.client.android:id/activated_icon")
    private MobileElement successActivatedIcon;

    @Step("Check success icon after activate coupon")
    public boolean successIconDisplayed() {
        return element(successActivatedIcon).isDisplayed();
    }

    @Step("Activate coupon")
    public FilterPage clickOnActivateCouponButton() {
        element(activateCouponButton).clickElement();
        return this;
    }

    @Step("Choose coupon")
    public FilterPage clickOnPartnerCoupon() {
        partner.click();
        return this;
    }

    @Step("Check that Filter screen opened")
    public boolean titleFilterDisplayed() {
        return element(titleFilter).isDisplayed();
    }

    public FilterPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
