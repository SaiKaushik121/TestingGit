package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GoogleSearch;
public class TestGoogleSearch
{
	public static void main(String[] args) 
	{
		GoogleSearch();
	}
	@Test
	public static void GoogleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		GoogleSearch.search_box(driver).click();
		GoogleSearch.search_data(driver).sendKeys("Testing");
		GoogleSearch.Hit_enter(driver).sendKeys(Keys.ENTER);
	}
}