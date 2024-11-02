package week3.homeAssignment;

// Week 3 Day 1 Odd Index upper char 

public class OddIndexCharChange {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] testChar = test.toCharArray();
		int length = testChar.length;
		for (int i=0;i<length;i++)
		{
			if (i%2 == 1)
			{
				System.out.println(i);
				testChar[i] = Character.toUpperCase(testChar[i]);
			}
		}
		System.out.println(testChar);
	}

}
