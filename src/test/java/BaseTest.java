import core.AppiumDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.authorizationPages.CardNumberPage;
import pages.authorizationPages.LoginPage;
import pages.authorizationPages.PasswordPage;

public class BaseTest {
    protected LoginPage loginPage;
    protected CardNumberPage cardNumberPage;
    protected PasswordPage passwordPage;

    @BeforeEach
    public void setUp() {
        loginPage = new LoginPage(AppiumDriverConfig.getDriver());
        cardNumberPage = new CardNumberPage(AppiumDriverConfig.getDriver());
        passwordPage = new PasswordPage(AppiumDriverConfig.getDriver());
    }

    @AfterEach
    public void tearDown() {
        AppiumDriverConfig.quitDriver();
    }
}
