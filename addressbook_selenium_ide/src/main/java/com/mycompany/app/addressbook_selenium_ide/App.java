package com.mycompany.app.addressbook_selenium_ide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","/home/yolukrit/selenium/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
    	
    	driver.get("http://192.168.56.103:8888/");

    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	driver.findElement(By.className("v-button")).click();
    	driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka4");
    	driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps4");
    	driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562712");
    	driver.findElement(By.id("gwt-uid-11")).sendKeys("rameshrk2000@hotmail.com");
    	driver.findElement(By.id("gwt-uid-13")).sendKeys("1/20/20,");
    	driver.findElement(By.className("v-button-primary")).click();
    	 //Thread.sleep(5000);
    	 //driver.quit();
    }
}
