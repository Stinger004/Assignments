package Testing;

public class Que3 {

 Difference between Explicit and Implicit wait.

Ans:-The implicit wait will tell the web driver to wait for certain amount of time before it throws "No Such Element Exception". The default setting is of 0 seconds. Once we set the time, web driver will wait for that time before throwing the exception.

Implicit wait is defined globally in the program. it means that this wait will be applied in all the actions performed during testing.

Due to the reason that it is applied to whole program, testers could'nt get, if there is any performance issue in it or not.

Syntax of Implicit wait is: driver.manage().timeouts.implicitlywait(Timeout,TimeUnit.SECOND)



The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or the maximum time exceeded before throwing an "ElementNotVisibleException" exception.

Explicit wait is defined for certain elements for certain conditions, it does not imply on the whole program.

Syntax of Explicit wait is: WebDriver wait = new WebDriverWait(WebDriverReference, TimeOut)
  

}
