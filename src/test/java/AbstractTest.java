import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Rule;
import org.testobject.appium.SuiteReporter;
import org.testobject.appium.junit.TestObjectAppiumSuiteWatcher;
import org.testobject.appium.junit.TestObjectTestResultWatcher;
import utility.AppiumDriverBuilder;

import java.net.MalformedURLException;

/**
 * Created by xviuda on 22-12-16.
 */
public abstract class AbstractTest {

    /* Set the test result watcher to send test results to TestObject. */

    @Rule
    public TestObjectAppiumSuiteWatcher suiteWatcher = new TestObjectAppiumSuiteWatcher();

    private AppiumDriver driver;

    protected Itv app;

    /* Establish a connection to TestObject, or to a local device test is local. */
    @Before
    public void connect() throws MalformedURLException {

        this.driver = AppiumDriverBuilder.forAndroid()
                .withApiKey(suiteWatcher.getApiKey())
                .withTestReportId(suiteWatcher.getTestReportId())
                .withEndpoint(suiteWatcher.getTestObjectOrLocalAppiumEndpointURL())
                .build();

        suiteWatcher.setRemoteWebDriver(driver);
        app = new Itv(driver);

    }

}