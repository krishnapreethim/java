package com.selenium.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFirstSelectOption 
{
	/*
	 * We can use this method to get first items in all selected items.
	 * String x=s.getFirstSelectedOption().getText();
	 */
	public static void main(String[] args) {
		//Open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//Located and operate multiple select drop-down developed using <select> tag
		driver.switchTo().frame("iframResult");
		WebElement frame=driver.findElement(By.name("cars"));
		Select sec=new Select(frame);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		act.click(sec.getOptions().get(2))
		.click(sec.getOptions().get(0))
		.click(sec.getOptions().get(1))
		.click(sec.getOptions().get(3)).perform();
		act.keyUp(Keys.CONTROL).perform();
		/*//get first(top) item in selected item
		String firstselected=sec.getFirstSelectedOption().getText();
		System.out.println("First in selected list is "+firstselected);
		//get all selected items
		List<WebElement> items=firstselected.get
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		//Deselect items
		sec.deselectByIndex(0);
		Thread.sleep(2000);
		sec.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		sec.deselectByValue("saab");
		Thread.sleep(2000);
		sec.deselectAll();
		driver.switchTo().defaultContent();
		driver.close();*/
		
	}

}
