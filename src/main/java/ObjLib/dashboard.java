package ObjLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashboard {
	
	@FindBy(xpath="//span[text()='Order Management']")
	private WebElement odrMgmt;
	
	@FindBy(xpath="//span[text()='User Management']")
	private WebElement usrMgmt;
	
	@FindBy(xpath="//span[text()='Customer Management']")
	private WebElement cstMgmt;
	
	@FindBy(xpath="//span[text()='Store Management']")
	private WebElement strMgmt;

	@FindBy(linkText="Log out")
	private WebElement logout;
	
	public void clicklogout()
	{
		logout.click();
	}
	
	public void clickOrderMgmt()
	{
		odrMgmt.click();
	}
	
	
	
	
	
}