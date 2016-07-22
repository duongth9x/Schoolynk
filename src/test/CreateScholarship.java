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
	public void CreateSchoolarship() throws InterruptedException {	
		Common.driver.get(Common.URL);
//		Select obj = Common.driver.findElement();
//		obj.selectByIndex(3);
//		obj.selectByValue("VN");
//		obj.selectByVisibleText("Viet Nam");
		
		Common.driver.findElement(CreateScholarshipObject.mnuHocduong).click();
		
//		Common.driver.findElement(CreateScholarshipObject.txtuseradmin).sendKeys("admin@schoolynk.cf");
//		Common.driver.findElement(CreateScholarshipObject.txtpassadmin).sendKeys("admin@12345");
//		Common.driver.findElement(CreateScholarshipObject.btnLoginadmin).click();
//		Common.driver.findElement(CreateScholarshipObject.menuScholarship).click();
//		Common.driver.findElement(CreateScholarshipObject.submenuCreate).click();
//		Common.driver.findElement(CreateScholarshipObject.optNonrefundable).click(); 
//		Common.driver.findElement(CreateScholarshipObject.txtNameScholarship).sendKeys("HUBT");
//		Common.driver.findElement(CreateScholarshipObject.txtNameOranization).sendKeys("Shoppie VN1");
//		Common.driver.findElement(CreateScholarshipObject.cboTypeOranization).click();
//		Common.driver.findElement(CreateScholarshipObject.cboTypeOranization).sendKeys("companies");
//		Common.driver.findElement(CreateScholarshipObject.cboOrigin).click();
//		Common.driver.findElement(CreateScholarshipObject.cboOrigin).sendKeys("Australia");
//		Common.driver.findElement(CreateScholarshipObject.cbxSchool).click();
//		Common.driver.findElement(CreateScholarshipObject.cboCurrency).sendKeys("USD");
//		Common.driver.findElement(CreateScholarshipObject.txtMinimum).sendKeys("8000000");
//		Common.driver.findElement(CreateScholarshipObject.cboBenifitMonth).click();
//		Common.driver.findElement(CreateScholarshipObject.cboBenifitMonth).sendKeys("6 Month");
//		Common.driver.findElement(CreateScholarshipObject.cboBenifitYear).click();
//		Common.driver.findElement(CreateScholarshipObject.cboBenifitYear).sendKeys("4 Year");
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartMonth).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartMonth).sendKeys("6 Month");
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartDay).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartDay).sendKeys("1");
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartYear).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartYear).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppStartYear).sendKeys("2016");
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndMonth).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndMonth).sendKeys("12 Month");
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndDay).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndDay).sendKeys("28");
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndYear).click();
//		Common.driver.findElement(CreateScholarshipObject.cboAppEndYear).sendKeys("2016");
//		Common.driver.findElement(CreateScholarshipObject.cbxDocument).click();
//		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	//Common.driver.quit();
	}
}
