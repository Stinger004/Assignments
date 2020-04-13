package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jha");
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ashish.jha@tothenew.com");
		

	}

}
