package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ItemCart {
	
	WebDriver driver;
	By Computers = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a");
	By Desktops = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img");
	By Addcart1 = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input");
	By Radio1   = By.id("product_attribute_72_5_18_65");
	By Radio2   = By.id("product_attribute_72_6_19_91");
	By Addcart2 = By.id("add-to-cart-button-72");
	
	public ItemCart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Select()
	{
		driver.findElement(Computers).click();
		driver.findElement(Desktops).click();
		driver.findElement(Addcart1).click();
	}
	
	public void Adding()
	{
	  driver.findElement(Radio1).click();
	  driver.findElement(Radio2).click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,600)");
	  driver.findElement(Addcart2).click();
	 
	  js.executeScript("window.scrollTo(600,0)");
	  
	}

}
