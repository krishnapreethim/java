package com.selenium.dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mercurytravels.co.in");
		/*WebElement chatbot=driver.findElement(By.xpath("//iframe[@data-testid='buble_iframe']"));
		driver.switchTo().frame(chatbot);
		driver.findElement(By.xpath("//*[name()='svg' and @cursor='pointer']//*[name()='circle']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();*/
		//Locate a drop-down developed using <select> teg and get all item
		WebElement dropdown=driver.findElement(By.name("theme"));
		Select sec=new Select(dropdown);
		List<WebElement> items=sec.getOptions();
		//Copy all items except first item(default item) into 2 arrays
		ArrayList<String> l1=new ArrayList<String>();
		ArrayList<String> l2=new ArrayList<String>();
		for(int i=1;i<items.size();i++)
		{
			l1.add(items.get(i).getText());
			l2.add(items.get(i).getText());
		}
		//Sort 2nd array
		Collections.sort(l2);
		//Compare both array
		/*if(l1.equals(l2))
		{
			System.out.println("Items are in sarted order");
		}
		else
		{
			System.out.println("Items are not in sorted order");
		}*/
		//Close site
		driver.close();
		
	}

}
