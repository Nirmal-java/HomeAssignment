package week1.homeAssignment;

import java.lang.reflect.Array;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float version = 91.0f;
		String developer = "Google";
		boolean isBeta = false;
		int releaseYear = 2008;
		char shortcutKey = 'C';
		System.out.println("Version:    "+version);
		System.out.println("Developer:  "+developer);
		System.out.println("isBeta:     "+isBeta);
		System.out.println("releaseYear:"+releaseYear);
		System.out.println("shortcutKey:"+shortcutKey);		
		
		// Type casting
		float floatReleaseYear = releaseYear;  // Wide casting 
		int intVersion = (int) version;       // Narrow casting 
		System.out.println("--------------------");
		System.out.println("floatReleaseYear:"+floatReleaseYear);
		System.out.println("intVersion      :"+intVersion);
				
		
		
	}

}
