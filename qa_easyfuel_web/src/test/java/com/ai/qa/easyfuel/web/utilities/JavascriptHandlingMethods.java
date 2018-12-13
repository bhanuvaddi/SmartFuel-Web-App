package com.ai.qa.easyfuel.web.utilities;

import com.ai.qa.easyfuel.web.envSetup.BaseTest;

public class JavascriptHandlingMethods implements BaseTest
{
	/**Method to handle alert
	 * @param decision : String : Accept or dismiss alert
	 */
	public void handleAlert(String decision)
	{
		if(decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}
}
