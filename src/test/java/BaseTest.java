import core.AppiumDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.CouponsPage;
import pages.FilterPage;
import pages.InviteMainPage;
import pages.authorizationPages.CardNumberPage;
import pages.authorizationPages.LoginPage;
import pages.authorizationPages.PasswordPage;
import pages.commonElements.BottomToolbar;

public class BaseTest {
    protected LoginPage loginPage;
    protected CardNumberPage cardNumberPage;
    protected PasswordPage passwordPage;
    protected InviteMainPage inviteMainPage;
    protected BottomToolbar bottomToolbar;
    protected CouponsPage couponsPage;
    protected FilterPage filterPage;

    @BeforeEach
    public void setUp() {
        loginPage = new LoginPage(AppiumDriverConfig.getDriver());
        cardNumberPage = new CardNumberPage(AppiumDriverConfig.getDriver());
        passwordPage = new PasswordPage(AppiumDriverConfig.getDriver());
        inviteMainPage = new InviteMainPage(AppiumDriverConfig.getDriver());
        bottomToolbar = new BottomToolbar(AppiumDriverConfig.getDriver());
        couponsPage = new CouponsPage(AppiumDriverConfig.getDriver());
        filterPage = new FilterPage(AppiumDriverConfig.getDriver());
    }

    @AfterEach
    public void tearDown() {
        AppiumDriverConfig.quiteApp();
    }
}
