package javaprograms;

public class SeperateSpecialCharAndCharacterAndNumber {

	public static void main(String[] args) {
		
		String s="a5b7$c%6v9@";
		String alpha="";
		String num="";
		String sp="";
		
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
			num=num+s.charAt(i);	
			}
			else
			{
				sp=sp+s.charAt(i);
			}
		}
			System.out.println(alpha);
			System.out.println(num);
			System.out.println(sp);
		}

	}

