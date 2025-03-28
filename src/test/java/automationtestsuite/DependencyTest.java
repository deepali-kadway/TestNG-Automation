package automationtestsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;

public class DependencyTest extends BaseTest {

	
	@Test
	public void LaunchApp()
	{
		driver.get("https://ebay.com");
		/*Adding assert for failing the scenario, in order to check failure*/
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="LaunchApp")
	public void SuccessApp()
	{
			driver.get("https://ebay.com");
	}
}
