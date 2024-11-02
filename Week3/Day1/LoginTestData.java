package week3.homeAssignment;

//Week 3 Day 1 Home Assignment 03  Single level Inheritance

public class LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("Inside enterUsername");
	}
	public void enterPassword()
	{
		System.out.println("Inside enterPassword");
	}

	public static void main(String[] args) {
		
		LoginTestData data1 = new LoginTestData();
		data1.enterCredentials();
		data1.navigateToHomePage();
		data1.enterUsername();
		data1.enterPassword();
	}

}
