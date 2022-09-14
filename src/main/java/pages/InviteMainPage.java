package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;

public class InviteMainPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/material_target_prompt_view")
    private MobileElement inviteText;

    @Step("Check invitation message")
    public boolean inviteTextDisplayed() {
        return element(inviteText).isDisplayed();
    }

    @Step("Hide invitation message")
    public InviteMainPage acceptInvitation() {
        inviteText.click();
        return this;
    }

    public InviteMainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
