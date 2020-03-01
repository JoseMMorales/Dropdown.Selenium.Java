package DropdownScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscendingAndDescendingOrder {
  
  // ArrayList > Collection
  // How to dropdown
  // Collections
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/............................./chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/register.php");
    
    Select country = new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
   
   //Actual List
    List actualList = new ArrayList();
    List <WebElement> countries = country.getOptions();
    
    //Capture WebElement Text
    for(WebElement ele:countries)
    {
      String data = ele.getText();
      actualList.add(data);
    }
    //Temp List
    List temp = new ArrayList();
    temp.addAll(actualList);
    
    //Ascending
    Collections.sort(temp);
    Assert.assertTrue(actualList.equals(temp));
  }
}
