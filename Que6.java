package Testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Que6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-text'][contains(text(),'Blogs')]")).click();

	}

}
