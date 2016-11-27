package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DELL on 11/12/2016.
 */
public class AfterLoginPage  extends BasePage{
	@FindBy(id="PH_user-email")
	private WebElement userEmail;

	public AfterLoginPage(WebDriver driver) {
		super(driver);
	}

	public String userEmailText() {
		return userEmail.getText();
	}
}
