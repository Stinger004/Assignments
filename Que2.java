package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        
        //launch the google chrome broswer and open the url (www.google.com)
        
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getClass());
        System.out.println(driver.getTitle());
    }

}

