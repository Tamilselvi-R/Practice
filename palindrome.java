package com.example.Tamil;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");

		String a,b="";
		a=s.nextLine();
		int l=a.length();
		for(int i=l-1;i>=0;i--) 
		{
			b+=a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("The given string is Palindrome");
		}
		else
			System.out.println("The given string is not a Palindrome");

		

	}

}
