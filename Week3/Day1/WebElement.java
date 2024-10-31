package week3.homeAssignment;

//Week3 Day 1 Home Assignment 01 - Inheritance 

// Base class WebElement
// Subclasses Button and TextField

public class WebElement {

	public void click()
	{
		System.out.println("Inside WebElement click");
	}
	
	public void setText(String text)
	{
		System.out.println("Inside WebElement setText");
		System.out.println("Received text "+text);
		
	}

	
}
