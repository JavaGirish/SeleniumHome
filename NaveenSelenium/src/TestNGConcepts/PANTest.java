package TestNGConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PANTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");

	}

	@DataProvider
	public Iterator<Object[]> datapro() {
		ArrayList<Object[]> o = TestUtil.getDataFromExcel();
		return o.iterator();
	}

	@Test(dataProvider = "datapro")
	public void panApp(String apptype, String category, String title, String lastname, String firstname,
			String middlename) {

		Select s1 = new Select(driver.findElement(By.xpath("//select[@data-placeholder='Select Application Type']")));
		s1.selectByVisibleText(apptype);

		Select s2 = new Select(driver.findElement(By.xpath("//select[@data-placeholder='Select Category']")));
		s2.selectByVisibleText(category);

		Select s3 = new Select(driver.findElement(By.xpath("//select[@data-placeholder='Select Title']")));
		s3.selectByVisibleText(title);

		driver.findElement(By.name("lastName")).sendKeys(lastname);

		driver.findElement(By.name("firstName")).sendKeys(firstname);

		driver.findElement(By.name("middleName")).sendKeys(middlename);

		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
