package week3.homeAssignment;

//Week 3 Day 1 Remove Duplicate Words

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println(text);
		int wordcount,wordrepeatcount;
		String words[] = text.split("\\s+");
		wordcount = words.length;
		for(int i=0;i<wordcount;i++)
		{
			wordrepeatcount = 0;
			for(int j=0;j<wordcount;j++)
			{
				if(words[i].equals(words[j]))
				{
				
					wordrepeatcount++;
				    if(wordrepeatcount > 1)
				    	words[j] = "";
				}
	
			}
		}	
		for (String wordsprint : words)
		{
			System.out.print(wordsprint+" ");
		}
		
		
	}

}
