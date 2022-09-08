package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CouponsPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Coupons']")
    private MobileElement titleCoupons;

    @AndroidFindBy(id = "de.payback.client.android:id/filter_button")
    private MobileElement filterButton;

    public boolean titleCouponsDisplayed() {
        return element(titleCoupons).isDisplayed();
    }

    public void clickOnFilterButton() {
        element(filterButton).clickElement();
    }

    public CouponsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
