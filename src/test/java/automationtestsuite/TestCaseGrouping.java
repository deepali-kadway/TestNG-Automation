package automationtestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test(groups="Sign-Up Form")
public class TestCaseGrouping {

/*Test cases can be grouped in form of testing types/functionality/combinational. 
  By grouping, you can choose to execute test cases which belong to a particular group
  This file contains basic concept flow for grouping*/

	public static WebDriver driver;
	
	@Test(groups="inputcheck",description="Checks input type fields")
	public void VerifyInputFields()
	{
	driver = new ChromeDriver();
	driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
	driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Deepali");
	driver.findElement(By.xpath("//input[starts-with(@id,'UserLastName')]")).sendKeys("Kadway");
	driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys("Automation Engineer");
	driver.quit();
	System.out.println("Input Fields verified");
	
	}
	
	@Test(groups="dropdowncheck", description="Checks dropdown menu")
	public void VerifyDropDownMenu()
	{
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		driver.quit();
		System.out.println("DropDown Menu verified");
	}
	
	@Test(groups="regression", description="Check both input and dropdown fields")
	public void RegressionTest()
	{
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Deepali");
		driver.findElement(By.xpath("//input[starts-with(@id,'UserLastName')]")).sendKeys("Kadway");
		driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys("Automation Engineer");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		driver.quit();
		System.out.println("Regression check complete");
	}
	
}
