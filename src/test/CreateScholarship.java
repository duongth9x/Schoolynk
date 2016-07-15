package test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import common.*;
import pageobject.CreateScholarshipObject;
public class CreateScholarship {
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws Exception {
		OpenBrowser.multi_browser(browser);	
		//Common.driver.manage().window().maximize();
		Common.driver.manage().timeouts().implicitlyWait(Common.TIMEOUTS,TimeUnit.SECONDS);
	}
	
	@Test
	public void Testbuying1() throws InterruptedException {	
		Common.driver.get(Common.URL);
		Common.driver.findElement(CreateScholarshipObject.txtuseradmin).sendKeys("admin@schoolynk.cf");
		Common.driver.findElement(CreateScholarshipObject.txtpassadmin).sendKeys("admin@12345");
		Common.driver.findElement(CreateScholarshipObject.btnLoginadmin).click();
		Common.driver.findElement(CreateScholarshipObject.menuScholarship).click();
		Common.driver.findElement(CreateScholarshipObject.submenuCreate).click();
		Common.driver.findElement(CreateScholarshipObject.optNonrefundable).click();
		Common.driver.findElement(CreateScholarshipObject.txtNameScholarship).sendKeys("HUBT1");
		Common.driver.findElement(CreateScholarshipObject.txtNameOranization).sendKeys("Shoppie VN1");
		Common.driver.findElement(CreateScholarshipObject.cboTypeOranization).click();
		Common.driver.findElement(CreateScholarshipObject.cboTypeOranization).sendKeys("companies");
		Common.driver.findElement(CreateScholarshipObject.cboOrigin).click();
		Common.driver.findElement(CreateScholarshipObject.cboOrigin).sendKeys("Australia");
		Common.driver.findElement(CreateScholarshipObject.checkboxSchool).click();
		Common.driver.findElement(CreateScholarshipObject.cboCurrency).sendKeys("USD");
		Common.driver.findElement(CreateScholarshipObject.txtMinimum).sendKeys("8000000");
		Common.driver.findElement(CreateScholarshipObject.cboMonth).click();
		Common.driver.findElement(CreateScholarshipObject.cboMonth).sendKeys("6 Month");
		Common.driver.findElement(CreateScholarshipObject.cboYear).click();
		Common.driver.findElement(CreateScholarshipObject.cboYear).sendKeys("4 Year");
		
		
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	//Common.driver.quit();
	}
}
