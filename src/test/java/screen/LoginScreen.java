package screen;

import data.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Created by xviuda on 22-12-16.
 */
public class LoginScreen extends AbstractScreen {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.TextView[1]")
    private MobileElement inlogText;

    @AndroidFindBy(id ="title_text")
    private MobileElement gebruikText;

    @AndroidFindBy(id="left_button")
    private MobileElement sluitBtn;

    @AndroidFindBy(id = "username_edittext")
    private MobileElement userField;

    @AndroidFindBy(id = "edittext_password")
    private  MobileElement passField;

    @AndroidFindBy(id ="com.kpn.epg:id/login_button")
    private MobileElement loginBtn;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }


    public void doLogin(User user){


        assertTrue("Niet op de inlogpagina", inlogText.getText().contains("Inloggen") );


        userField.sendKeys(user.id);
        passField.sendKeys(user.pin);
        hideKeyboard();
        takeScreenshot();
        loginBtn.tap(1,1);

    }

    public void acceptConditions(){
        assertTrue("voorwaarden scherm is getoond",gebruikText.getText().contains("Gebruiksvoorwaarden"));
        takeScreenshot();
        sluitBtn.click();
    }


}
