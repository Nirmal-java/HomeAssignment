package week3.homeAssignment;

//Week 3 Day 1 Reverse Odd position in the string 

public class StringReverseOdd {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String testWords[] = test.split("\\s+");
		int wordcount = testWords.length;
		
		for(int i=0;i<wordcount;i++)
		{
			if (i==0 || (i%2 == 0))
			{
				System.out.print(testWords[i]+" ");
			}
			else
			{	
				char[] text1chararray =  testWords[i].toCharArray();
				int charcount = text1chararray.length;
				for(int j=(charcount-1);j>=0;j--)
				{
					System.out.print(text1chararray[j]);
				}	
				System.out.print(" ");
			}
		}		

	}

}
