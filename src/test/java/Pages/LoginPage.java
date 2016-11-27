package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 11/12/2016.
 */
public class LoginPage extends BasePage {
    @FindBy(id = "mailbox__login")
    private WebElement loginName;

	@FindBy(id="mailbox__password")
	private WebElement loginPassword;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;


	public LoginPage(WebDriver driver) {
		super(driver);
	}

public 	AfterLoginPage login(String name, String password) {
		loginName.sendKeys(name);
		loginPassword.sendKeys(password);
		authButton.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return new AfterLoginPage(driver);
	}
}
