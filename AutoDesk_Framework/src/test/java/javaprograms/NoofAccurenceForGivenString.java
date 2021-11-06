package javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NoofAccurenceForGivenString {

	public static void main(String[] args) {
		
		String s="india";
		//step1: create any type of set collection and ad all the character of the given string
		//HashSet<Character> set=new HashSet<Character>();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		//System.out.println(set);
		//stpe2:compare with each char of set with all character of the given string
		for(char ch:set)
		{
			int count=0;
			//compare with each character and increase count
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//step3: print both char of set and count
		
		System.out.println(ch+" "+count);
		}
	}

}
