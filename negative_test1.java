package assignment4;
 
import static org.testng.Assert.assertNotEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class negative_test1 {
    String userName = "ashish_jha";
    String password = "abcd1234";
    
    // Confirmation page Title
    String ConfirmationPage = "Flight Confirmation: Mercury Tours";
 
    // Details
    String Meal = "Vegetarian";
    String CardType = "MasterCard";
    String ExpirationMonth = "08";
    String ExpirationYear = "2005";
    String Country = "INDIA";
    
    @Test
    public void ShouldNot_BookFlight_With_SameDepartureAndArrival() {

    	System.setProperty("webdriver.chrome.driver", "/home/ashish/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
 
        String nPassengers = "1";
        String DepartingFrom = "London";
        String DepartingMonth = "May";
        String DepartingDate = "12";
        String ArrivingIn = "London";
        String ReturnMonth = "May";
        String ReturnDate = "18";
        String ServiceClass = "Business class";
        String Airline = "Pangea Airlines";
                
        // Login
        driver.findElement(By.name("userName")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        
        // Search Flight with same Departure and Arrival
        driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
        Select Pess = new Select(driver.findElement(By.name("passCount")));
            Pess.selectByValue(nPassengers);
        Select DepFrom = new Select(driver.findElement(By.name("fromPort")));
            DepFrom.selectByValue(DepartingFrom);
        Select DepMon = new Select(driver.findElement(By.name("fromMonth")));
            DepMon.selectByVisibleText(DepartingMonth); 
        Select DepDay = new Select(driver.findElement(By.name("fromDay")));
            DepDay.selectByValue(DepartingDate);
        Select ArrIn = new Select(driver.findElement(By.name("toPort")));
            ArrIn.selectByValue(ArrivingIn);
        Select RetMon = new Select(driver.findElement(By.name("toMonth")));
            RetMon.selectByVisibleText(ReturnMonth);
        Select RetDay = new Select(driver.findElement(By.name("toDay")));
            RetDay.selectByValue(ReturnDate);
        driver.findElement(By.xpath("//input[@value='Business']")).click();
        Select Air = new Select(driver.findElement(By.name("airline")));
            Air.selectByVisibleText(Airline);
        driver.findElement(By.name("findFlights")).click();
        
        // Select Flight
        driver.findElement(By.name("reserveFlights")).click();
        
        // Fill Customer's details and Book Flight
        driver.findElement(By.name("passFirst0")).sendKeys("ashish");
        driver.findElement(By.name("passLast0")).sendKeys("jha");
        Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
            meal.selectByVisibleText(Meal);
        Select CC = new Select(driver.findElement(By.name("creditCard")));
            CC.selectByVisibleText(CardType);
        Select ExpMon = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
            ExpMon.selectByVisibleText(ExpirationMonth);
        Select ExpYr = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
            ExpYr.selectByValue(ExpirationYear);
        driver.findElement(By.name("creditnumber")).sendKeys("4444555566667777");
        driver.findElement(By.name("cc_frst_name")).sendKeys("ashish");
        driver.findElement(By.name("cc_mid_name")).sendKeys("");
        driver.findElement(By.name("cc_last_name")).sendKeys("jha");
        WebElement wb = driver.findElement(By.name("billAddress1"));
            wb.clear();
            wb.sendKeys("A-703");
        driver.findElement(By.name("billAddress2")).sendKeys("Aditya Mega City");
        WebElement wb2 = driver.findElement(By.name("billCity"));
            wb2.clear();
            wb2.sendKeys("Ghaziabad");
        WebElement wb3 = driver.findElement(By.name("billState"));
            wb3.clear();
            wb3.sendKeys("UP");
        WebElement wb4 = driver.findElement(By.name("billZip"));
            wb4.clear();
            wb4.sendKeys("201014");
        Select BCon = new Select(driver.findElement(By.name("billCountry")));
            BCon.selectByVisibleText(Country);
        WebElement wb5 = driver.findElement(By.name("delAddress1"));
            wb5.clear();
            wb5.sendKeys("A-703");
        driver.findElement(By.name("delAddress2")).sendKeys("Aditya Mega City");
        WebElement wb6 = driver.findElement(By.name("delCity"));
            wb6.clear();
            wb6.sendKeys("Ghaziabad");
        WebElement wb7 = driver.findElement(By.name("delState"));
            wb7.clear();
            wb7.sendKeys("UP");
        WebElement wb8 = driver.findElement(By.name("delZip"));
            wb8.clear();
            wb8.sendKeys("201014");
        Select DelCoun = new Select(driver.findElement(By.name("delCountry")));
            DelCoun.selectByVisibleText(Country);
        driver.switchTo().alert().accept();
        driver.findElement(By.name("buyFlights")).click();
        
        String GenTitle = driver.getTitle();
        assertNotEquals(GenTitle, ConfirmationPage);    
    }
 
}    