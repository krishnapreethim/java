package com.selenium.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownGetOptions {
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement DropDown=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]"));
		Select carslists= new Select(DropDown);
		List<WebElement> passengers= carslists.getOptions();
		for(WebElement passenger:passengers) {
			System.out.println(passenger.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
		//
	}

}
