package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1 {

	public static void main(String[] args) throws InterruptedException  {
		
		 System.setProperty("webdriver.gecko.driver", "/home/ashish/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
	        WebDriver driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	        Thread.sleep(2000);
	        System.out.println(driver.switchTo().alert().getText());
	        driver.switchTo().alert().accept();
	        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().dismiss();
	        driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().sendKeys("Assignment");
	        driver.switchTo().alert().accept();
	        
	}

}
