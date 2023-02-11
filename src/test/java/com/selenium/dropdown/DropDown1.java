package com.selenium.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement car= driver.findElement(By.id("carselect"));
		Select carslists= new Select(car);
		List<WebElement> cars=carslists.getOptions();
		//Note: Above cars reference store all the values from dropdown
		for(WebElement car1:cars) {
		System.out.println(car1.getText()); // This will print one after another car by
		
		}
		driver.close();
	}

}
