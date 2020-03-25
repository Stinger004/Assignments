package Assignment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1 {

    public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver", "/home/ashish/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
        WebDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com/");
            System.out.println(driver.getTitle());
    }
}

