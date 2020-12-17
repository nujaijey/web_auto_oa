package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class StaffManagementPage extends BasePage {
    private By addStaff = By.xpath("//span[text()='添加员工']");

    private WebDriver driver;
    // log4j日志对象
    private Logger logger = Logger.getLogger(BasePage.class);
    public StaffManagementPage(WebDriver driver) {
        super(driver);
    }
}
