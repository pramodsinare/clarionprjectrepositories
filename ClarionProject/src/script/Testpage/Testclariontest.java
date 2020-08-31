package script.Testpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import script.PageObect.Loginpageobject;
import script.PageObect.POsearchpromisor;
import script.PageObect.Pageobject2;

public class Testclariontest {
	WebDriver driver;
	Loginpageobject login;
	Pageobject2 page;
	POsearchpromisor pagesearch;

	@Test(priority = 1)
	public void testlogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\2020 software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://182.74.238.209/clarion_promise_qa/index.php");
		login = new Loginpageobject(driver);
		login.setuserid("sanjeetk@clariontechnologies.co.in");
		login.setpassword("clarion");
		login.clickonlogin();

	}

	@Test(priority = 2)
	public void addpromise() {
		page = new Pageobject2(driver);
		page.addmromisorclick();
		// page.addpromises.click();
		page.selectpromisor_log();
		page.enterpromise("I have done promisess");
		page.setpromise();
	}

	@Test(priority = 3)
	public void searchpromisess() {
		pagesearch = new POsearchpromisor(driver);
		pagesearch.nameofpromisor("Sonali test");
		pagesearch.searchmethod();
		pagesearch.verifypromisesadd();
		pagesearch.setlogout();
	}

}
