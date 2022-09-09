package pages.commonElements;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import pages.BasePage;

public class BottomToolbar extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/main_feed_dest")
    private MobileElement actualButton;

    @AndroidFindBy(id = "de.payback.client.android:id/coupon_center_dest")
    private MobileElement couponsButton;

    @Step("Open Actual screen")
    public void clickOnActualButton() {
        actualButton.click();
    }

    @Step("Open Coupon screen")
    public void clickOnCouponsButton() {
        couponsButton.click();
    }

    public BottomToolbar(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
