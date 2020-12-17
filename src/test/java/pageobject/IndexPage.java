package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {
    private By oaSystemBy = By.xpath("//span[text()='OA系统3.0']");
    private By personnelManagementBy = By.xpath("//span[text()='人事管理']");
    private By staffManagementBy = By.xpath("//span[text()='员工管理']");
    WebDriver driver;
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickOaSystem() {
        clickElement(oaSystemBy);
    }

    public void clickPersonnelManagement() {
        clickElement(personnelManagementBy);
    }

    public void clickStaffManagement() {
        clickOaSystem();
        clickPersonnelManagement();
        clickElement(staffManagementBy);
    }
}
