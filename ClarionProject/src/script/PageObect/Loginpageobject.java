package script.PageObect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpageobject {
	WebDriver driver;

	public Loginpageobject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='txtUsername']")
	public WebElement username;
	@FindBy(xpath = "//input[@name='txtPassword']")
	public WebElement password;
	@FindBy(xpath = "//input[@name='submit1']")
	public WebElement loginn;

	public void setuserid(String userid) {
		username.sendKeys(userid);
	}

	public void setpassword(String userpass) {
		password.sendKeys(userpass);

	}

	public void clickonlogin() {
		loginn.click();

	}

	public void verifyloginsuccesful() {
		String actulurl = driver.getCurrentUrl();
		String Expectedurl = "http://182.74.238.209/clarion_promise_qa/index.php";
		Assert.assertEquals(actulurl, Expectedurl);
	}
}
