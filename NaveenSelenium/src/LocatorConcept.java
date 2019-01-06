import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys("nairgirish@gmail.com");
		driver.findElement(By.id("registration_password")).sendKeys("Password@12");
		driver.findElement(By.id("registration_show_password")).click();
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.name("firstname")).sendKeys("Girish");
		Select st= new Select(driver1.findElement(By.id("month")));
		st.selectByVisibleText("Mar");
		driver.quit();

	}

}
