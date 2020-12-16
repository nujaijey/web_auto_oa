package utils;

// 参数化--常量提取
public class Constant {
    // 服务地址
    public static final String BASE_URL = "http://test.zt.qxdaojia.com";
    // 登录地址
    public static final String LOGIN_URL = BASE_URL + "/#/login";
    // 首页地址
//    public static final String INDEX_URL = BASE_URL + "/Index/index.html";
    // 员工管理地址
    public static final String PERSONNEL_MANAGEMENT_URL = BASE_URL + "/#//oaSystem/personnelManagement/staffManagement";
    // 正确的用户名和密码
    public static final String CORRECT_USERNAME = "admin";
    public static final String CORRECT_PASSWORD = "123456";
    // 浏览器类型
    public static final String BROWSER_TYPE = "chrome";
    // 用户名
    public static final String NICK_NAME = "自动化测试帐号1";
    // 显式等待超时时间
    public static final int WAIT_TIMEOUT = 8;
}
