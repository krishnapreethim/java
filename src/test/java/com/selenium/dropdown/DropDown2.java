package com.selenium.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		WebElement multidropdown=driver.findElement(By.id("multiple-select-example"));
		Select dropdown=new Select(multidropdown);
		List<WebElement>options=dropdown.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
