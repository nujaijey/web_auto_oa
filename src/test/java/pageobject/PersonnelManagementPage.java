package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class PersonnelManagementPage extends BasePage {

    private WebDriver driver;
    // log4j日志对象
    private Logger logger = Logger.getLogger(BasePage.class);
    public PersonnelManagementPage(WebDriver driver) {
        super(driver);
    }
}
