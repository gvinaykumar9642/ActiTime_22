package javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class PrintOnlyUniqueCharInString {

			public static void main(String[] args) {
				
				String s="INDIA";
				//step1: create any type of set collection and ad all the character of the given string
				
				LinkedHashSet<Character> set=new LinkedHashSet<Character>();
				for(int i=0; i<s.length(); i++)
				{
					set.add(s.charAt(i));
				}
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
				if(count==1) //this statement is only for duplicates
				System.out.print(ch);
				}
			}

		}




