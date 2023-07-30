package com.example.Tamil;
import java.util.Scanner;
public class Switch_statement
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your grade");
		Scanner s=new Scanner(System.in);
		char g=s.next().charAt(0);
		switch(g) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("work hard");
			break;
		default :
			System.out.println("Better luck next time");
		}
			
		
		
		

	}

}
