package com.example.Tamil;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the password");
		String b=a.nextLine();
		a.close();
		StringBuffer c=new StringBuffer(b);
		int count=0;
		if(b.length()>=8) {
			for(int i=0;i<b.length();i++)
				if(Character.isUpperCase(c.charAt(i)))
					for(i=0;i<b.length();i++)
						if(Character.isLowerCase(c.charAt(i)))
							for(i=0;i<b.length();i++) 
								if(Character.isDigit(c.charAt(i)))
									if(b.contains("@") || b.contains("#")
								          || b.contains("!") || b.contains("~")
								          || b.contains("$") || b.contains("%")
								          || b.contains("^") || b.contains("&")
								          || b.contains("*") || b.contains("(")
								          || b.contains(")") || b.contains("-")
								          || b.contains("+") || b.contains("/")
								          || b.contains(":") || b.contains(".")
								          || b.contains(", ") || b.contains("<")
								          || b.contains(">") || b.contains("?")
								          || b.contains("|")) 
										count=1;
			}
		if(count==1) {
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Password is Invalid");
	}
}}