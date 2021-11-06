package javaprograms;

import java.util.LinkedHashSet;

public class PrintonlyUniqueWordIntheString {

public static void main(String[] args) {
		
		String s="welcome to tyss welcome to Bangalore";
		String[] str=s.split(" ");
		//step1: create any type of set collection and ad all string array to set		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		//stpe2:compare with each char of set with all the value of the given string
		for(String word:set)
		{
			int count=0;
			//compare with each character and increase count
			for(int i=0; i<str.length; i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			//step3: print both char of set and count
      if(count==1)
		System.out.print(word+" ");
		}
	}
}
