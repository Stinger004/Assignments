package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();

			driver.get("http://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashish");
			driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("jha");
			driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).sendKeys("Bihar Drabhnga");
			driver.findElement(By.xpath("//*[@id=\'eid\']/input")).sendKeys("Ashish@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7065721070");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			driver.findElement(By.xpath("//input[@value='Cricket']")).click(); 
			driver.findElement(By.id("msdd")).click();
			driver.findElement(By.xpath("//li[@class='ng-scope'][8]")).click();
			driver.findElement(By.xpath("//li[@class='ng-scope'][15]")).click();
		    driver.findElement(By.xpath("//option[@value='Java']")).click();
		    driver.findElement(By.xpath("//option[@value='India']")).click();
		    
		    driver.findElement(By.xpath("//span[@class='select2-selection_arrow']")).click();
		    driver.findElement(By.xpath("///li[@role='treeitem'][6]")).click();
		    driver.findElement(By.id("yearbox")).click();
		    driver.findElement(By.xpath("//option[@value='1997']")).click();
		    driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
		    driver.findElement(By.xpath("//option[@value='October']")).click();
		    driver.findElement(By.id("daybox")).click();
		    driver.findElement(By.xpath("//option[@value='9']")).click();
		    driver.findElement(By.id("firstpassword")).sendKeys("Ash12345");
		    driver.findElement(By.id("secondpassword")).sendKeys("Ash12345");
		    
		    //validating gender selected
		    
		    WebElement gender =driver.findElement(By.xpath("//input[@type='radio']"));
		    if(!gender.isSelected())
		    {
		    	System.out.println("Gender not selected");
		    }
		    else
		    {
		    	System.out.println("Gender  selected");
		    }
		    
		    //validating title
		    
		    String expected="Register";
		    String actual=driver.getTitle();
		    if(expected.equals(actual))
		    {
		    	System.out.println("this is equal is register");
		    }
		    else
		    {
		    	System.out.println("this is not equal to register");
		    }
		    
	}

}
