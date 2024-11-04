package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	By Login = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By Username = By.id("Email");
	By Password = By.id("Password");
	By Loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void SignIn()
	{
		driver.findElement(Login).click();;
	}
	
	public void SetValues(String Uname,String Pswrd)
	{
		driver.findElement(Username).clear();
		driver.findElement(Username).sendKeys(Uname);
		
		driver.findElement(Password).sendKeys(Pswrd);
	
		driver.findElement(Loginbtn).click();
	}
	

}
