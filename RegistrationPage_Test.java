package assignment4;
import static org.testng.Assert.assertEquals;
 
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class RegistrationPage_Test {
 
    String userName = "Ashish_jha";
    String password = "abcd1234";
    String AfterSuccesfulRegisterURL = "http://newtours.demoaut.com/create_account_success.php"; 
    
    @Test
    public void Should_Successfully_Register_Using_ValidData() {
    	System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Ashish");
        driver.findElement(By.name("lastName")).sendKeys("jha");
        driver.findElement(By.name("phone")).sendKeys("7065721070");
        driver.findElement(By.id("userName")).sendKeys("ashish.jha@tothenew.com");
        driver.findElement(By.name("address1")).sendKeys("Paras Tierea");
        driver.findElement(By.name("address2")).sendKeys("Sector 137");
        driver.findElement(By.name("city")).sendKeys("Noida");
        driver.findElement(By.name("state")).sendKeys("UP");
        driver.findElement(By.name("postalCode")).sendKeys("201013");
        driver.findElement(By.name("country")).click();
        Select Country = new Select(driver.findElement(By.name("country")));
            Country.selectByVisibleText("INDIA");
        driver.findElement(By.name("email")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("confirmPassword")).sendKeys(password);
        driver.findElement(By.name("register")).click();
        
        String GeneratedURL = driver.getCurrentUrl();
        assertEquals(GeneratedURL, AfterSuccesfulRegisterURL);
    }
}
