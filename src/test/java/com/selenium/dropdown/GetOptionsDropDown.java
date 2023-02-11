package com.selenium.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionsDropDown {
	public static void main(String[] args) throws Exception
	{
		//Open Browser and Launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mercurytravels.co.in");
		WebElement DropDown=driver.findElement(By.name("theme"));
		Select NewDropDown= new Select(DropDown);
		List<WebElement> items=NewDropDown.getOptions();
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		driver.close();
	}
}
