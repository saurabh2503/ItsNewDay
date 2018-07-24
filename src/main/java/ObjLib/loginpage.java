package ObjLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neogrowth.test.BaseClass;

public class loginpage extends BaseClass {

	@FindBy(xpath="//*[@id='fm1']/div[1]/input")
	private WebElement un;
	
	@FindBy(name="_eventId_login_otp")
	private WebElement loginOtp;
	
	@FindBy(xpath="//span[text()='Successfully sent OTP to your registered mobile number ']")
	private WebElement successfulOtpMsg;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@class='btn btn-success']")
	private WebElement nxtButton;
	
//	public loginpage()
//	{
//		PageFactory.initElements(driver, loginpage.class);
//	}
	
	public void enterUsername()
	{
	
		un.sendKeys("8949397932");
	}
	
	public void clickLoginOtp()
	{
		loginOtp.click();;
	}
	
	public String fetchOtpMsg()
	{
		String acTmsg=successfulOtpMsg.getText();
		return acTmsg;
	}
	
	public void enterOtp()
	{
		pwd.sendKeys("132456");
	}
	
	public void clickNxt()
	{
		nxtButton.click();
	}
	
	
	
	
	
	
}
