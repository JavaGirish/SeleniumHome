import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions ax= new Actions(driver);
		
		ax.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
		release().build().perform();
		Thread.sleep(5000);
		driver.close();	
		
		
		
		
	}

}
