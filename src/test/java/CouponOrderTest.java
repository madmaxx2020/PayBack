import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestListener.class)
public class CouponOrderTest extends BaseTest {

    @Test
    @Owner("Maksim")
    @Description("Login-Choose Coupon-Activate Coupon")
    public void checkCouponOrder() {

        assertTrue(loginPage.loginButtonDisplayed(), "Application doesn't start");
        loginPage.clickLoginButton();
        cardNumberPage
                .setCardNumber()
                .clickConfirmButton();
        passwordPage
                .setPassword()
                .clickPasswordOKButton();

        assertTrue(inviteMainPage.inviteTextDisplayed(), "No invitation message");
        inviteMainPage.acceptInvitation();

        bottomToolbar.clickOnCouponsButton();
        assertTrue(couponsPage.titleCouponsDisplayed(), "Can't switch to Coupons screen");
        couponsPage.clickOnFilterButton();

        assertTrue(filterPage.titleFilterDisplayed(), "Can't switch to Filter screen");
        filterPage
                .clickOnPartnerCoupon()
                .clickOnActivateCouponButton();
        assertTrue(filterPage.successIconDisplayed(), "Can't activate new coupon");
    }
}
