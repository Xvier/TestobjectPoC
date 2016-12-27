import data.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.testobject.appium.junit.TestObjectAppiumSuite;
import org.testobject.rest.api.appium.common.TestObject;



@RunWith(TestObjectAppiumSuite.class)
@TestObject(testObjectSuiteId = 7, testObjectApiKey = "CB1DF80B672F4D248D37E7C9AF466A9F")

public class StartTest extends AbstractTest {

    @Test
    public void loginTest(){
        app.envScreen().goToLogin();
        app.loginScreen().doLogin(User.VALID_USER);
        app.loginScreen().acceptConditions();
        app.tvScreen().checkSearch();
    }


}
