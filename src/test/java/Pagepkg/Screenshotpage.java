package Pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpage {
	
WebDriver driver;
	
	By Continue = By.xpath("//*[@id=\"shipping-buttons-container\"]/input");
	
    public Screenshotpage(WebDriver driver)
    {
    	this.driver = driver;
    }
    public void shot() throws IOException
    {
    	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //for page screenshot
    	FileHandler.copy(src,new File("D://Shot1.png"));
    	
    }
    public void next()
    {
    	driver.findElement(Continue).click();
    }

}
