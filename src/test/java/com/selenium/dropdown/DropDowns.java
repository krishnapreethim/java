package com.selenium.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
	public static void main(String[] args) throws Exception
	{
		//Open Browser and Launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mercurytravels.co.in");
		//Minimize chat bot and close banner
		/*WebElement chatbot = driver.findElement(By.xpath("//iframe[@data-testid='bubble_iframe']"));
		driver.switchTo().frame(chatbot);
		driver.findElement(By.xpath("//*[name()='svg' and @cursor='pointer']//*[name()='circle']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();*/
		//Located a drop -down and select an item
		WebElement DropDown=driver.findElement(By.name("theme"));
		Select NewDropDown= new Select(DropDown);
		NewDropDown.selectByIndex(4);
		Thread.sleep(2000);
		NewDropDown.selectByVisibleText("Food and Wine");
		Thread.sleep(2000);
		NewDropDown.selectByValue("27");
		Thread.sleep(2000);
		driver.close();
		
	}

}
