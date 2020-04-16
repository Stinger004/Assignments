package Testing1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("/home/ashish/eclipse-workspace/Testing1/src/Testing1/Que2.properties");
		pro.load(file);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(pro.getProperty("FirstName"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(pro.getProperty("LastName"));
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).click();
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(pro.getProperty("Address"));
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(pro.getProperty("Email"));
		driver.findElement(By.xpath("//input[@type='tel']")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(pro.getProperty("Phone"));
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//multi-select/div[2]/ul/li[8]")).click();
		driver.findElement(By.id("basicBootstrapForm")).click();
		driver.findElement(By.id("Skills")).click();
		Select sel = new Select(driver.findElement(By.id("Skills")));
		List<WebElement> list =sel.getOptions();
//		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals(pro.getProperty("Skills")))
				break;
			driver.findElement(By.id("Skills")).sendKeys(Keys.DOWN);
//			Thread.sleep(100);
		}
		driver.findElement(By.id("Skills")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("countries")).click();
		Select sel2 = new Select(driver.findElement(By.id("countries")));
		List<WebElement> list1 =sel2.getOptions();
//		System.out.println(list.size());
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getText().equals(pro.getProperty("Country")))
				break;
			driver.findElement(By.id("countries")).sendKeys(Keys.DOWN);
//			Thread.sleep(100);
		}
		driver.findElement(By.id("countries")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys(pro.getProperty("Country"));
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("yearbox")).click();
	    driver.findElement(By.id("yearbox")).sendKeys(pro.getProperty("year"),Keys.ENTER);
//	    driver.findElement(By.id("yearbox")).sendKeys(Keys.ENTER, Keys.ARROW_LEFT);
	    driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
	    driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys(pro.getProperty("month"),Keys.ENTER);
	    driver.findElement(By.id("daybox")).click();
	    driver.findElement(By.id("daybox")).sendKeys(pro.getProperty("day"),Keys.ENTER);
	    driver.findElement(By.id("firstpassword")).sendKeys(pro.getProperty("password"));
	    driver.findElement(By.id("secondpassword")).sendKeys(pro.getProperty("password"));
	    driver.findElement(By.id("submitbtn")).click();
	}

}
