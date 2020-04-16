package Testing1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Que4 {
@BeforeSuite
public static void beforeSuite() {
System.out.println("before suite");
}
@BeforeTest
public static void beforeTest() {
System.out.println("\t before test");
}
@BeforeClass
public static void beforeClass() {
System.out.println("\t\t before class TestingTestNG");
}
@BeforeMethod
public static void beforeMethod() {
System.out.println("\t\t\t before every method");
}
@Test
public static void Test1() {
System.out.println("\t\t\t\t inside test 1");
}
@Test
public static void Test2() {
System.out.println("\t\t\t\t inside test 2");
}
@AfterMethod
public static void afterMethod() {
System.out.println("\t\t\t after every method");
}
@AfterClass
public static void afterClass() {
System.out.println("\t\t after class TestingTestNG");
}
@AfterTest
public static void afterTest() {
System.out.println("\t after test");
}
@AfterSuite
public static void afterSuite() {
System.out.println("After suite");
}

}