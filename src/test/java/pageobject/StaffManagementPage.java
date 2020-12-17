package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class StaffManagementPage extends BasePage {
    private By searchInputBy = By.xpath("//input[@placeholder='请输入工号/姓名/手机号其中一项']");
    private By searchButtonBy = By.xpath("//span[text()='搜索']");
    private By addStaff = By.xpath("//span[text()='添加员工']");

    private WebDriver driver;
    // log4j日志对象
    private Logger logger = Logger.getLogger(BasePage.class);
    public StaffManagementPage(WebDriver driver) {
        super(driver);
    }
}

