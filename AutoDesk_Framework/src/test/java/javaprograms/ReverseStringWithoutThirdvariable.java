package javaprograms;

import java.util.Scanner;

public class ReverseStringWithoutThirdvariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the a value");
		int a=sc.nextInt();
		
		System.out.println("enter the b value");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Answer is "+a);

	}

}
