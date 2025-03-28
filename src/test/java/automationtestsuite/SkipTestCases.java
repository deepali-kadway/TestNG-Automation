package automationtestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {

	public static WebDriver driver;
	Boolean datasetup = false;

	@Test(enabled = false)
	public void SkipTC1_Registration() {
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

	@Test
	public void SkipTC2_InputCheck() {
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Deepali");
		System.out.println("Skipping InputCheck due to to incomplete code");
		throw new SkipException("Skipping InputCheck");
	}

	@Test
	public void SkipTC3_DropDownCheck() {
		if (datasetup == true) {
			driver = new ChromeDriver();
			driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
			WebElement dropdown = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
			Select select = new Select(dropdown);
			select.selectByIndex(2);
			driver.quit();
			System.out.println("DropDown Menu verified");
		}

		else {
			throw new SkipException("No execution required");
		}
	}
}
