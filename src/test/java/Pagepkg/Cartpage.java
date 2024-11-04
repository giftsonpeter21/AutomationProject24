package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cartpage {
	
WebDriver driver;
	
	By Tocart = By.className("cart-label");
	By Estimate = By.name("estimateshipping");
	By Country = By.id("CountryId");
	By Zipcode = By.id("ZipPostalCode");
	
	public Cartpage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Cart() throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(Tocart).click();
	}
	public void ShipEstimate(String zcode)
	{
		WebElement Cntry= driver.findElement(Country);
		Select C= new Select(Cntry);
		C.selectByValue("41");
		
		driver.findElement(Zipcode).sendKeys(zcode);
		
		driver.findElement(Estimate).click();
	}

}
