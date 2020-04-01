package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("https://www.myntra.com");
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='home-&-living']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@data-reactid='529']"))).click().build().perform();
		System.out.println(driver.getCurrentUrl());
	}

}
