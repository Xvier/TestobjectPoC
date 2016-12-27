package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by xviuda on 23-12-16.
 */
public class TvScreen extends AbstractScreen {


    @AndroidFindBy(id="action_search")
    private MobileElement searchBtn;

    public TvScreen (AppiumDriver driver){
        super(driver);
    }


    public void checkSearch(){
        takeScreenshot();
        assertTrue("Searchbutton is niet gevonden",searchBtn.isDisplayed());
        searchBtn.click();
        takeScreenshot();
    }



}
