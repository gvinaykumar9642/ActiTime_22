package javaprograms;

public class ReverseStringWithRespectToWord {

	public static void main(String[] args) {
		
		String s="welcome to test yentra";
		String[] str=s.split(" ");
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}
