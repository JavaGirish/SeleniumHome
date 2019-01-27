package SelfPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class Multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://jqueryui.com/selectable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions ax= new Actions(driver);
		
		ax.keyDown(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("//*[@class='ui-widget-content ui-selectee' and contains(text(),'Item 1')]")).click();
		//ax.clickAndHold(driver.findElement(By.xpath("//*[@class='ui-widget-content ui-selectee' and contains(text(),'Item 1')]"))).sendKeys(Keys.CONTROL);
		driver.findElement(By.xpath("//*[@class='ui-widget-content ui-selectee' and contains(text(),'Item 2')]")).click();
		driver.findElement(By.xpath("//*[@class='ui-widget-content ui-selectee' and contains(text(),'Item 3')]")).click();
		
		
		
		
//		ax.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
//		moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
//		release().build().perform();
		
		
		
	}

}
