package ObjLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderMgmtLib {
	

	@FindBy(id="customer_name")
	private WebElement cust_name;
	
	@FindBy(id="store_id")
	private WebElement storeId;
	
	@FindBy(id="buyer_id")
	private WebElement cust_id;
	
	@FindBy(id="select2-city_name-container")
	private WebElement city_select;
	
	@FindBy(xpath="//span[text()='Search']")
	private WebElement search_button;
	
	@FindBy(xpath="//*[contains(text(),'Customer View')]")
	private WebElement cust_view;
	
	@FindBy(xpath="//input[@value='transactionview']")
	private WebElement order_view;
	
	public void enterCustname()
	{
		cust_name.sendKeys("testman");
	}
		
	public void clickOrderView()
	{
		order_view.click();
	}
	
	public void clickStoreId()
	{
		storeId.click();
	}
}
