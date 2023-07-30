package com.example.Tamil;
import java.util.Scanner;
public class count_the_consonants 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the word");
		Scanner a=new Scanner(System.in);
		String b=a.nextLine();
		int c=0;
		for(int i=0;i<b.length();i++) 
		{
			if(b.charAt(i)!=('a')&&b.charAt(i)!=('i')&&b.charAt(i)!=('e')&&b.charAt(i)!=('o')&&b.charAt(i)!=('u')) 
			{
				c++;
			}
		}
		System.out.println("Number of Consonants in the given string is "+c);
		}
	}
