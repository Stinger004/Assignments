package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
       
       
        driver.get("https://www.tothenew.com/contact-us/");
        System.out.println(driver.getTitle());
        
        
        
             
    }

}

