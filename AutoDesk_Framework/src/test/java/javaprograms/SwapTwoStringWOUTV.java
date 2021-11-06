package javaprograms;

public class SwapTwoStringWOUTV {

	public static void main(String[] args) {
		
		String s1="java";
		String s2="tyss";
		
		//step1:
	  s1=s1+s2;    //javatyss
		//step2:
      s2=s1.substring(0,s1.length()-s2.length());     //java
      //step3:
      s1=s1.substring(s2.length());    //tyss
		 System.out.println(s1);
	}
    
}
