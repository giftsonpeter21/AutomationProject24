package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage {
	
	 WebDriver driver;
	 By Myaccount = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	 By Logout    = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	 
	 public Logoutpage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public void Exit() 
	 {
		 driver.findElement(Myaccount).click();
		 driver.findElement(Logout).click();
	 }

}
