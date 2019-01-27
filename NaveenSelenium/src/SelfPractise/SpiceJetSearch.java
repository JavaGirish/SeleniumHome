package SelfPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-month=0]//a[text()=29]")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td[@data-month=1]//a[text()=10]")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='paxinfo']"))).click().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		Actions ax1 = new Actions(driver);
		ax1.moveToElement(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']"))).click().perform();
		driver.quit();
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
