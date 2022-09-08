package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InviteMainPage extends BasePage {

    @AndroidFindBy(id = "de.payback.client.android:id/material_target_prompt_view")
    private MobileElement inviteText;

    public boolean inviteTextDisplayed() {
        return element(inviteText).isDisplayed();
    }

    public InviteMainPage acceptInvitation() {
        inviteText.click();
        return new InviteMainPage(driver);
    }

    public InviteMainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
