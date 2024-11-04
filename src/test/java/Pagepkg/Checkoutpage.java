package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {
	WebDriver driver;
	By Checkbox = By.id("termsofservice");
	By Checkout = By.id("checkout");
	By Country  = By.id("BillingNewAddress_CountryId");
	By City     = By.id("BillingNewAddress_City");
	By Address1 = By.id("BillingNewAddress_Address1");
	By Zipcode  = By.id("BillingNewAddress_ZipPostalCode");
	By Phone    = By.id("BillingNewAddress_PhoneNumber");
	By Continue = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
	
	public Checkoutpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Checkouting()
	{
		driver.findElement(Checkbox).click();
		driver.findElement(Checkout).click();
	}
	public void Details(String city,String adress,String Zcode,String phn)
	{
		WebElement Cntry= driver.findElement(Country);
		Select C= new Select(Cntry);
		C.selectByValue("41");
		
		driver.findElement(City).sendKeys(city);
		driver.findElement(Address1).sendKeys(adress);
		driver.findElement(Zipcode).sendKeys(Zcode);
		driver.findElement(Phone).sendKeys(phn);
	}
	public void next()
	{
		driver.findElement(Continue).click();
	}

}
