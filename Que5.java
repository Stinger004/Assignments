package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	System.out.println(driver.findElements(By.tagName("iframe")).size());

     }
}
