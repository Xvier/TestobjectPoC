package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.junit.TestObjectTestResultWatcher;
import org.testobject.rest.api.appium.common.TestObjectCapabilities;

import java.net.URL;

/**
 * Created by xviuda on 22-12-16.
 */
public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {

    protected String apiKey;
    protected String testReportId;

    public static AndroidDriverBuilder forAndroid() {
        return new AndroidDriverBuilder();
    }

    public static class AndroidDriverBuilder extends AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver> {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        public AndroidDriver build() {

            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_API_KEY, apiKey);
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_TEST_REPORT_ID, testReportId);

            capabilities.setCapability("deviceName", "testDevice");

            return new AndroidDriver(endpoint, capabilities);

        }

    }

    protected URL endpoint;

    public SELF withEndpoint(URL endpoint) {
        this.endpoint = endpoint;

        return (SELF) this;
    }

    public SELF withApiKey(String apiKey) {
        this.apiKey = apiKey;

        return (SELF) this;
    }

    public SELF withTestReportId(String testReportId) {
        this.testReportId = testReportId;

        return (SELF) this;
    }

    public abstract DRIVER build();

}
