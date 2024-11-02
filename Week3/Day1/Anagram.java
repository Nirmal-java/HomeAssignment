package week3.homeAssignment;

// Week3 Day 1 Anagram Assignment 

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops" , text2 = "potss";
		
		if (text1.length() != text2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else
		{
			char[] text1chararray =  text1.toCharArray();
			char[] text2chararray =  text2.toCharArray();
			Arrays.sort(text1chararray);
			Arrays.sort(text2chararray);
			if (Arrays.equals(text1chararray, text2chararray))
			{
				System.out.println(text1+" & "+ text2 + " is Anagram");
			}
			else
			{
				System.out.println(text1+" & "+ text2 + " is not Anagram");
			}	
		}
			
	}

}
