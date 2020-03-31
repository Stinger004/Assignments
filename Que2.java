package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s = new Select(driver.findElement(By.id("select-demo")));
		for(int i=0;i<8;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		Select s2 = new Select(driver.findElement(By.id("multi-select")));
		s2.selectByVisibleText("New Jersey");
		s2.selectByVisibleText("New York");
		s2.selectByVisibleText("Texas");
		driver.findElement(By.id("printMe")).click();
		Thread.sleep(2000);                           
		driver.findElement(By.id("printAll")).click();
	}

}