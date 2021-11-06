package javaprograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharGivenString {

	public static void main(String[] args) {
		
		String s="india";
		//step1: create any type of set collection and ad all the character of the given string
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		//stpe2:compare with each char of set with all character of the given string
		for(char ch:set)
		{
			System.out.println(ch);
}
	}
}