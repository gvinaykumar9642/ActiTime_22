package javaprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatewordsinString {

public static void main(String[] args) {
		
		String s="welcome to tyss welcome to bangalore";
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
			
		System.out.print(word+" ");
		}
	}
}
