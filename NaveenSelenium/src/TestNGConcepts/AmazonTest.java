package TestNGConcepts;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	@Test(priority=3,groups="A")
	public void AmazonTitle()
	{	
		String a = driver.getTitle();
		System.out.println("Title is: " + a);
		
		Assert.assertEquals(a, "Online Shopping site Amazon.in");	
		
	}
	
	@Test(priority=2,groups="B",dependsOnMethods="logoCheck")
	public void linkCount()
	{
		ArrayList <WebElement> count= (ArrayList <WebElement>) driver.findElements(By.tagName("a"));
		System.out.println("Total Links " + count.size());
	}
	
	@Test(priority=1,groups="C")
	public void logoCheck()
	{
		driver.findElement(By.linkText("Try Prime")).isDisplayed();
			}
	
	
}
