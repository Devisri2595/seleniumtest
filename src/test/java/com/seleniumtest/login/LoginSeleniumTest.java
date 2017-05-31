package com.seleniumtest.login;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.TestCase;

public class LoginSeleniumTest extends TestCase  {


private WebDriver driver;

/*
@Before
public void setup() throws MalformedURLException, UnknownHostException{

   System.out.println("from setup");
	 driver=new FirefoxDriver();
    driver.get("http://localhost:8080/JavaProjectDemo/pages/login.jsp");
}
*/

@Test
public void testAuthenticationSuccessWhenProvidingCorrectCredentials(){
	
 System.setProperty(
    "webdriver.chrome.driver",
    "D:\\Devi\\selenium\\chromedriver.exe");

	
	 System.out.println("from setup");
	 driver=new ChromeDriver();
    driver.get("http://localhost:8080/JavaProjectDemo/pages/login.jsp");
	
	System.out.println("test success");
    driver.findElement(By.id("name")).sendKeys("lincy");
    driver.findElement(By.id("pwd")).sendKeys("lincy@123");
   driver.findElement(By.id("login")).click();
//   assertTrue(driver.getCurrentUrl().endsWith("/<webapp>/"));
}


/*
@Test
public void testAuthenticationFailureWhenProvidingBadCredentials(){
	
	System.out.println("test failure");
    driver.findElement(By.id("name")).sendKeys("invaliduser");
    driver.findElement(By.id("pwd")).sendKeys("invalidpassword");     
    driver.findElement(By.id("login")).click();
    assertTrue(driver.getCurrentUrl().endsWith("failed"));
}
*/


}