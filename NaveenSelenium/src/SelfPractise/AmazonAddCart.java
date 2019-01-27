package SelfPractise;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class AmazonAddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String s = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("webcam for computer");
		driver.findElement(By.xpath("//input[@class= 'nav-input'and @value='Go']")).click();
		driver.findElement(By.linkText("Logitech C270 HD Webcam (Black)")).click();
		ArrayList <String> newtab= new ArrayList <String>(driver.getWindowHandles());
		
		driver.switchTo().window(newtab.get(newtab.size()-1));

		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		

	}

}
