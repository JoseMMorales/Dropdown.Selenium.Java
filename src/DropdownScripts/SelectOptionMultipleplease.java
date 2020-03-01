package DropdownScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionMultipleplease {
  
  WebDriver driver;
  
  public static void main(String[] args) throws Exception {
    SelectOptionMultipleplease register = new SelectOptionMultipleplease();
    register.method1();
    register.method2();
  }
  
  public void method1() throws Exception {
    System.setProperty("webdriver.chrome.driver","/.........................../chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().fullscreen();
    Thread.sleep(2000);
    
    //Select by Name in the dropdown
    Select country = new Select(driver.findElement(By.name("country")));
    country.selectByVisibleText("ALGERIA");
  
    driver.close();
  }
  
  public void method2() throws Exception {
    System.setProperty("webdriver.chrome.driver", "/................................/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://jsbin.com/osebed/2");
    driver.manage().window().fullscreen();
     
    //Selecting Items in a Multiple SELECT elements
    Select fruits = new Select(driver.findElement(By.id("fruits")));
      fruits.selectByVisibleText("Banana");
      fruits.selectByIndex(1);
      Thread.sleep(2000);
  
      driver.quit();
  }
}
