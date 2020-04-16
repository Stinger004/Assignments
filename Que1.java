package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
	        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
	       
WebElement table=driver.findElement(By.xpath("//*[@id=\'et-boc\']/div/div/div[3]/div/div[2]/div[5]/div/table"));
   table.findElements(By.xpath("//*[@id=\'et-boc\']/div/div/div[3]/div/div[2]/div[5]/div/table/tbody/tr[4]")).size();
   table.findElements(By.xpath("//*[@id=\'et-boc\']/div/div/div[3]/div/div[2]/div[5]/div/table/tbody/tr[4]/td[3]")).size();
  System.out.println(table.findElement(By.xpath("//*[@id=\'et-boc\']/div/div/div[3]/div/div[2]/div[5]/div/table/tbody/tr[4]/td[3]")).getText());
	

	}

}
