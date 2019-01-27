import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Actions ax= new Actions(driver);
		ax.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
		driver.findElement(By.xpath("//span[@class= 'nav-action-inner' and contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nairgirish100@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//a[@id='ap_change_login_claim']")).click();
		driver.navigate().to("https://www.amazon.in/");
		
		//ax.moveToElement(driver.findElement(By.id("menu-list-addons"))).build().perform();
		
		
	}

}
