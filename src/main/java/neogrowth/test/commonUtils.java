package neogrowth.test;

import org.testng.Assert;

public class commonUtils {
	
	public boolean hardAssert(String act, String exp)
	{
		Assert.assertEquals(act, exp);
		return true;
	}

}
