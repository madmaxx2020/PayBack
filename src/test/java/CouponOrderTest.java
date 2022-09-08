import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CouponOrderTest extends BaseTest {

    @Test
    public void checkCouponOrder() {

        assertTrue(loginPage.loginButtonDisplayed());
        loginPage.clickLoginButton();
        cardNumberPage
                .setCardNumber()
                .clickConfirmButton();
        passwordPage
                .setPassword()
                .clickPasswordOKButton();
    }
}
