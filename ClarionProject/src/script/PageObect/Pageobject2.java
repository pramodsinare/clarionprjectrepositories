package script.PageObect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pageobject2 {
	WebDriver driver;
	public Pageobject2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='promise/log_promise.php']")
	public WebElement addpromises;
	@FindBy(xpath = "//select[@name='cboEmp']")
	public WebElement promiseslog;
	@FindBy(xpath = "//*[@id='txtPromise']")
	public WebElement promise;
	@FindBy(xpath = "//input[@id='btnSubmit']")
	public WebElement logpromises;

	public   void addmromisorclick() {
		addpromises.click();
		
		
		
	}
	public void selectpromisor_log() {
		Select select = new Select(promiseslog);
		select.selectByVisibleText("Sonali test");

	}

	public void setpromise() {
		logpromises.click();

	}

	public void enterpromise(String promisee) {

		promise.sendKeys(promisee);
	}

	

}
