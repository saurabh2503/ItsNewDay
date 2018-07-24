package neogrowth.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjLib.dashboard;
import ObjLib.loginpage;
import ObjLib.orderMgmtLib;

public class loginNG extends BaseClass
{
								//	 public static void main(String[] args) {
								//		 System.setProperty("webdriver.chrome.driver", "D:\\workspace\\test\\chromedriver.exe");
								//         WebDriver driver = new ChromeDriver();
								//         driver.manage().window().maximize();
		@Test
		public void test()
		{
			loginpage lp = new loginpage();
			lp=PageFactory.initElements(driver, loginpage.class);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			lp.enterUsername();
			lp.clickLoginOtp();
			
			commonUtils cu = new commonUtils();
	        String expMsg= lp.fetchOtpMsg();
	        cu.hardAssert("Successfully sent OTP to your registered mobile number", expMsg);
	        System.out.println(expMsg);
			lp.enterOtp();
			lp.clickNxt();
			String title= driver.getTitle();
            System.out.println(title);					  
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			
			
			dashboard db = new dashboard();
			db=PageFactory.initElements(driver, dashboard.class);
//			db.clicklogout();
			db.clickOrderMgmt();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			orderMgmtLib om= new orderMgmtLib();
			om=PageFactory.initElements(driver, orderMgmtLib.class);
			om.clickOrderView();
	        
			
			
	        
		}
}
