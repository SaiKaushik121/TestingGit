package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class GoogleSearch
{
	static WebElement element;
	@Test
	public static WebElement search_box(WebDriver driver)
	{	
		element = driver.findElement(By.name("q"));
		return element;
	}
	@Test
	public static WebElement search_data(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	@Test
	public static WebElement Hit_enter(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
}
