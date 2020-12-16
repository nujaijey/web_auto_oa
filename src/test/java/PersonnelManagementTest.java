import common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.BasePage;
import pageobject.LoginPage;
import utils.Constant;

public class PersonnelManagementTest extends BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpTest() {
        // 前置
        // 1、打开浏览器
        driver = openBrowser(Constant.BROWSER_TYPE);
        // 2、访问登录地址
        driver.get(Constant.LOGIN_URL);
        // 3、最大化浏览器
        driver.manage().window().maximize();
        // 4、登录
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginSuccess(Constant.CORRECT_USERNAME,Constant.CORRECT_PASSWORD);
    }



    @AfterMethod
    public void tearDownTest() {
        // 后置
        // 关闭浏览器，销毁driver
        driver.quit();
    }

}
