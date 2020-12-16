package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class LoginPage extends BasePage {
    private By usernameBy = By.xpath("//input[@placeholder='请输入用户名\\手机号\\邮箱']");
    private By passwordBy = By.xpath("//input[@placeholder='请输入密码']");
    private By loginBy = By.xpath("//span[text()='登录']");

    private WebDriver driver;
    // log4j日志对象
    private Logger logger = Logger.getLogger(BasePage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String username) {
        typeData(usernameBy,username);
    }

    public void typePassword(String password) {
        typeData(passwordBy,password);
    }

    public void clickLogin() {
        clickElement(loginBy);
    }

    public void loginSuccess(String username,String password) {
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }
}
