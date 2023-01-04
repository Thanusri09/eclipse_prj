package epam_09;

import java.util.Scanner;

public class Strdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1="CSE";
		String s2="CSE";
		String s3=new String("CSE").intern();
		String s4=new String("CSE").intern();
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3==s4);
		String s5=new String("cse").intern();
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s3.substring(0,2));
		System.out.println(s2+s3);
		String s8="madam";
		String s9=s8;
		StringBuffer sb=new StringBuffer(s8);
		sb.reverse();
		String s10=sb.toString();
		if(s9.equals(s10))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		String s11="Mark";
		String s12="kate";
		if(s11.charAt(s11.length()-1)==s12.charAt(0))
		{
			System.out.println(s11.substring(0,s11.length()-1)+s12.substring(0,s12.length()));
		}	
		StringBuffer sg=new StringBuffer();
		String s13="wipro";
		int t=2;
		for(int i=0;i<5;i++)
		{
			sg.append(s13.substring(0,2));
		}
		System.out.println(sg.toString());

	}

}
