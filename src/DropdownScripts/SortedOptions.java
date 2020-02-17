package DropdownScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedOptions {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "/...................../chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.id("animals"));
	
	//Select elements in the dropdown
	Select se = new Select(element);
	
	//Crete original list
	List originalList = new ArrayList();
	//Create Temporay list
	List Templist = new ArrayList();
		
	//Capture all options original list of dropdown
	List <WebElement> options = se.getOptions();
	
	//For End Loop statement
	for(WebElement e:options)
	{
		originalList.add(e.getText());
		Templist.add(e.getText());
	}
	
	//Print Before sorting temporary list
	System.out.println("Dropdown Original list " +originalList);
	//System.out.println("Before sorting temp List: " +Templist);
	
	//Sorting Temp List
	Collections.sort(Templist);
	
	//Print After sorting temporary lis
	//System.out.println("After sorting original List: " +originalList);
	System.out.println("Temp list Sorted: " +Templist);
	
	//If Statement to compare both lists
	if(originalList == Templist)
	{
		System.out.println("Dropdown Sorted!");
	}
	else
	{
		System.out.println("Dropdown Not Sorted!");
	}
	
	driver.close();

  }

}
