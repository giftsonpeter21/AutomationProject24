package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Cartpage;
import Pagepkg.Checkoutpage;
import Pagepkg.ItemCart;
import Pagepkg.Loginpage;
import Pagepkg.Logoutpage;
import Pagepkg.Screenshotpage;
import Utilities.Excelutils;

public class Testclass extends Baseclass{
	
	@Test
	public void AllTest() throws Exception
	{
		Loginpage Lp = new Loginpage(driver);
		Lp.SignIn();
		String xl = "D:\\Software Testing\\NoCommData.xlsx";
		String sheet = "Sheet1";
		int Rowcount = Excelutils.getRowvalue(xl, sheet);
		for(int i=1;i<=Rowcount;i++)
		{
			String Username = Excelutils.getCellvalue(xl, sheet, i, 0);
			System.out.println("Username--------"+Username);
			String Password = Excelutils.getCellvalue(xl, sheet, i, 1);
			System.out.println("Password--------"+Password);
			Lp.SetValues(Username,Password);
			driver.navigate().refresh();
			Thread.sleep(1000);
		}
	  ItemCart ic = new ItemCart(driver);
	  ic.Select();
	  ic.Adding();
	  Thread.sleep(2000);
	  
	  Cartpage Cp = new Cartpage(driver);
	  Cp.Cart();
	  Cp.ShipEstimate("670004");
	  Thread.sleep(2000);
	  
	  Checkoutpage cp = new Checkoutpage(driver);
	  cp.Checkouting();
	  cp.Details("Kochi", "StreetNo.21", "670004","9956230171");
	  cp.next();
	  Thread.sleep(3000);
	  
	  Screenshotpage sp = new Screenshotpage(driver);
	  sp.shot();
	  sp.next();
	  Thread.sleep(2000);
	  
	  Logoutpage Lp2 = new Logoutpage(driver);
	  Lp2.Exit();
	  
		
	}

}
