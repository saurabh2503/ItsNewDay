package neogrowth.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ObjLib.dashboard;
import ObjLib.orderMgmtLib;

public class orderMgmt extends BaseClass {
	
	@Test
	public void ordertest()
	{
	dashboard db = new dashboard();
	db=PageFactory.initElements(driver, dashboard.class);
//	db.clicklogout();
	db.clickOrderMgmt();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	orderMgmtLib om= new orderMgmtLib();
	om=PageFactory.initElements(driver, orderMgmtLib.class);
	om.clickOrderView();
	
	}
}
