package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by xviuda on 22-12-16.
 */
public class EnvScreen extends AbstractScreen {


    @AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.TextView[3]")
    private MobileElement sitEnv;


    public EnvScreen (AppiumDriver driver){
        super(driver);
    }


    public void goToLogin(){

        sitEnv.click();
        takeScreenshot();
    }



}
