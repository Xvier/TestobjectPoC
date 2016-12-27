import io.appium.java_client.AppiumDriver;
import screen.EnvScreen;
import screen.LoginScreen;
import screen.TvScreen;

/**
 * Created by xviuda on 22-12-16.
 */
public class Itv {

    private AppiumDriver driver;

    public Itv(AppiumDriver driver) {
        this.driver = driver;
    }


    public LoginScreen loginScreen() {
        return new LoginScreen(driver);
    }

    public EnvScreen envScreen(){
        return new EnvScreen(driver);
    }

    public TvScreen tvScreen(){
        return new TvScreen(driver);
    }

}
