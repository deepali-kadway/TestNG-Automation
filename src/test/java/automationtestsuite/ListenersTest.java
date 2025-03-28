package automationtestsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;

public class ListenersTest extends BaseTest {

	
	@Test
	public void LaunchApp()
	{
		driver.get("https://ebay.com");
		/*Adding assert for failing the scenario, in order to capture failure scenario in listener*/
		Assert.assertTrue(false);
	}
	
	@Test
	public void SuccessApp()
	{
		driver.get("https://ebay.com");
	}
}
