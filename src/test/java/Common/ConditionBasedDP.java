package Common;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class ConditionBasedDP {

	@DataProvider(name = "create")
	public Object[][] dataset_1(Method m) {
		Object[][] testdata = null;

		if (m.getName().equals("TestDataset_1")) 
		{
			testdata = new Object[][] 
					{ 
						{ "username1", "password1" }, 
						{ "username2", "password2" } 
					};
		}
		else if(m.getName().equals("TestDataset_2")) 
		{
			testdata = new Object[][]
					{
						{"username1","password1","1234"},
						{"username2","password2","6779"}
					};
		}
		
		return testdata;
	}

}
