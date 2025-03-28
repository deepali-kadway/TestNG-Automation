package automationtestsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUseCase {
	
	@Test(dataProvider="dataset_1")
	public void TestDataset_1(String username, String password)
	{
		System.out.println(username+" and "+password);
	}
	
	@Test(dataProvider="dataset_2")
	public void TestDataset_2(String username, String password, String Passkey)
	{
		System.out.println(username+" and "+password+" with "+Passkey);
	}
	
	/*We are using here more organized representation of data in rows and columns*/
	@DataProvider
	public Object[][] dataset_2()
	{
		return new Object[][]
				{
					{"Newton","Manage@789","1234"},
					{"Greg","Greg%098","8698"}
				};
	}
	
	/*Representation of data in form of arrays for rows and columns*/
	@DataProvider
	public Object[][] dataset_1()
	{
	
		Object [][] dataset = new Object[2][2];
		
		/*data from the first row & first column*/
		dataset[0][0] = "Leo";
		dataset[0][1] = "Leo@1234";
		
		/*data from the second row & second column*/
		dataset[1][0] = "Roscoe";
		dataset[1][1] = "Rosco@23";
		
		return dataset;
		
	}
	
}
