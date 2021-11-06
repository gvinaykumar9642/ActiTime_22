package javaprograms;

import java.util.Scanner;

public class ReverseStringWOULengthmethodAVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s=sc.nextLine();
		//String s="amulya";
		char[] a = s.toCharArray();
		String rev="";
		
		int count = 0;
		for(char ch:a)
		{
			count++;
		}
   //System.out.println(count);
   
   for(int i=count-1; i>=0; i--)
   {
	rev=rev+s.charAt(i);   
   }
   System.out.println(rev);
   
	}

}
