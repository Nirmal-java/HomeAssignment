package week2.homeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// Open leaftaps website
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		// Log in to leaftaps website
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Account Creation steps
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test Account 1001");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		// Account Creation steps - Drop down selection for Industry
		WebElement industryWE = driver.findElement(By.name("industryEnumId"));
		Select indutryDD = new Select(industryWE);
		indutryDD.selectByVisibleText("Computer Software");
		// Account Creation steps - Drop down selection for Ownership
		WebElement owenershipWE = driver.findElement(By.name("ownershipEnumId"));
		Select owenershipDD = new Select(owenershipWE);
		owenershipDD.selectByVisibleText("S-Corporation");
		// Account Creation steps - Drop down selection for Source
		WebElement sourceWE = driver.findElement(By.id("dataSourceId"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByValue("LEAD_EMPLOYEE");
		// Account Creation step - Drop down selection for Marketing
		WebElement marketingWE = driver.findElement(By.id("marketingCampaignId"));
		Select marketingDD = new Select(marketingWE);
		marketingDD.selectByIndex(5);
		// Account Creation step - State
		WebElement stateWE = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDD = new Select(stateWE);
		stateDD.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
