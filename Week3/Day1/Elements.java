package week3.homeAssignment;

// Week3 Day 1 Home Assignment 01 - Inheritance 

public class Elements extends Button {
	
	public static void main (String[] args)
	{
		Elements element1 = new Elements();
		element1.setText("Call from Elements");
		element1.click();
		element1.submit(); 
		//element1.getText();  - Can't be called from here, this is inside TextField which is not connected with Button
		//element1.clickCheckButton();  - Can't be called from here, This is inside CheckBoxButton child of Button
		//element1.selectRadioButton(); - Can't be called from here, This is inside RadioButton child of Button
		
	}

}
