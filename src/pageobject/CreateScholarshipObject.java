package pageobject;

import org.openqa.selenium.By;

public class CreateScholarshipObject {
	public static By mnuHocduong = By.cssSelector("ul.list-abws.swiper-wrapper > li:nth-child(1) h3 a");
	
	
	
	public static By txtuseradmin = By.xpath(".//*[@id='app-layout']/form/div/input[1]");
	public static By txtpassadmin = By.xpath(".//*[@id='app-layout']/form/div/input[2]");
	public static By btnLoginadmin = By.xpath(".//*[@id='app-layout']/form/div/button");
	public static By menuScholarship = By.xpath(".//*[@id='wrapper']/nav/div[2]/ul/li[2]/a");
	public static By submenuCreate = By.xpath(".//*[@id='ex_schoolarship']/li[2]/a");
	public static By optNonrefundable = By.xpath(".//*[@id='frm']/div/div[2]/div[1]/div/div[1]/label/input");
	public static By optNointerest = By.xpath(".//*[@id='app-layout']/form/div/button");
	public static By optWithinterest = By.xpath(".//*[@id='frm']/div/div[2]/div[1]/div/div[3]/label/input");
	public static By txtNameScholarship = By.xpath(".//*[@id='frm']/div/div[2]/div[2]/div/input");
	public static By txtNameOranization = By.xpath(".//*[@id='frm']/div/div[2]/div[3]/div/input");
	public static By cboTypeOranization = By.cssSelector(".form-control");
	public static By cboOrigin = By.xpath(".//*[@id='origin_of_oran']");
	public static By cbxSchool = By.xpath(".//*[@id='frm']/div/div[2]/div[6]/div/label[1]/input");
	public static By cbxDorm = By.xpath(".//*[@id='frm']/div/div[2]/div[6]/div/label[2]/input");
	public static By cbxOne = By.xpath(".//*[@id='frm']/div/div[2]/div[7]/div/div[3]/label/input");
	public static By cboCurrency = By.xpath(".//*[@id='frm']/div/div[2]/div[8]/div/select");
	public static By txtMinimum = By.xpath(".//*[@id='range-01']/input");
	public static By cboBenifitMonth = By.xpath(".//*[@id='period-01']/div/div[1]/select");
	public static By cboBenifitYear = By.xpath(".//*[@id='period-01']/div/div[2]/select");
	public static By cboAppStartMonth = By.name("month_start");
	public static By cboAppStartDay = By.name("day_start");
	public static By cboAppStartYear = By.name("year_start");
	public static By cboAppEndMonth = By.name("month_end");
	public static By cboAppEndDay = By.name("day_end");
	public static By cboAppEndYear = By.name("year_end");
	public static By cbxDocument = By.xpath(".//*[@id='frm']/div/div[2]/div[13]/div/label[1]");
	
	
	
}
