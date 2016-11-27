package Tests;

import Pages.AfterLoginPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Created by DELL on 10/30/2016.
 */
public class MyTest extends BaseTest {
    LoginPage loginPage;
    AfterLoginPage afterLoginPage;

    @BeforeClass
    public void setUp() {
        driver.get("https://mail.ru/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testName()  {
        String actual = loginPage.login("mytest_test", "337774a")
                                 .userEmailText();
        Assert.assertEquals(actual, "mytest_test@mail.ru", "Error");
    }

}