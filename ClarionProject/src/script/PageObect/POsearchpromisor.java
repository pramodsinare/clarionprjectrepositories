package script.PageObect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POsearchpromisor {
	WebDriver driver;
	public POsearchpromisor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='cboEmp']")
	public WebElement selectpromisor;
	@FindBy(xpath = "//input[@name='btnSearch']")
	public WebElement search;
	//@FindBy(xpath = "//font[text()=\"Promise added successfully\"]")
	//public WebElement txt;
	@FindBy(xpath = "//b[contains(text(),'LOGOUT')]")
	public WebElement logout;

	public void nameofpromisor(String name) {
		selectpromisor.sendKeys(name);

	}

	public void searchmethod() {
		search.click();

	}



	public void verifypromisesadd() {
		String actualtxt=driver.findElement(By.xpath("//font[text()=\\\"Promise added successfully\\\"]")).getText();
		String Expectedtext="Promise added successfully";
		Assert.assertEquals(actualtxt,Expectedtext );
		
	}
	public void setlogout() {
		logout.click();

	}

}