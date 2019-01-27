package SelfPractise;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.trivago.in/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Sydney");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='horus-btn-search__label']")).click();
		Thread.sleep(5000);
		
		for (int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
		}
		driver.findElement(By.xpath("//time[@datetime='2019-03-25']")).click();
		
		driver.findElement(By.xpath("//time[@datetime='2019-03-29']")).click();
		Actions ax= new Actions(driver);
		ax.sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.xpath("//span[@class='df_component df_label']")).click();
		WebDriverWait x= new WebDriverWait(driver, 45);
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Quest At Sydney Olympic Park']")));
		
		String a= driver.findElement((By.xpath("//*[@title='Quest At Sydney Olympic Park']"))).getText();
		if(a.contains("Quest At Sydney Olympic Park"))
		{
			driver.findElement
			(By.xpath("//div[@data-id='b4f5bdbe']//button")).
			click();
		}
		
		Thread.sleep(5000);
		ArrayList <String> ne= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ne.get(ne.size()-1));
		
		
		Select sx= new Select(driver.findElement(By.xpath("//select[@class='children-selector']")));
		sx.selectByVisibleText("1");
		Thread.sleep(5000);
		
		Select s2= new Select(driver.findElement(By.id("childAge0Room1")));
		s2.selectByVisibleText("10");
		
		driver.findElement(By.id("update-availability-button")).click();
		
	}

}
