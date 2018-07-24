package neogrowth.test;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass{
	public WebDriver driver;
	
	@BeforeTest
	public void BeforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		String url = "https://dev.advancesuite.in:3020";
        driver.get(url);
		
        }
	
	
	
	
	@AfterClass
	public void configAT()
	{
		System.out.println("configAT");

	}
	
	@AfterTest
	public void configAC()
	{
		System.out.println("configAC");
//		driver.close();
	}
}