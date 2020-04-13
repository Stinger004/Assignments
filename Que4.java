package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
 
        driver.get("https://www.tothenew.com/");
 driver.findElement(By.xpath("//div[@id='page-wrapper']"
                + "//header[@id='header'][2]//ul[@class='clearfix menu']//"
                + "li[@class='menu-item']/a[contains(text(),'contact us')]")).click();
//by using Id
        driver.findElement(By.id("h-contact-us")).click();
        
             
    }

}
