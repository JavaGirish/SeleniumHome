package SelfPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmiratesSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximise window
		driver.manage().deleteAllCookies(); //delete cookies
		
		driver.get("https://www.emirates.com/in/english/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='js-field-input field__input js-dropdown-open field__input--active' and  @name='Departure airport']")).sendKeys("Mumbai");
		
		
		
		
	}

}
