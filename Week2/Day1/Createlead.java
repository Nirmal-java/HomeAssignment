package week2.homeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {

	public static void main(String args[]) {
		// Open the leaftaps website through chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		// login to leaftaps website
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("democsr");
		WebElement userPwd = driver.findElement(By.id("password"));
		userPwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test First Name1");
		// Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last Name1");
		// Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Last Name1");
		// Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		// Click Create Button
		driver.findElement(By.className("smallSubmit")).click();

		// Get and Print the Title
		System.out.println(driver.getTitle());

		// Close browser
		driver.close();
	}

}
