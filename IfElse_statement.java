package com.example.Tamil;
import java.util.Scanner;
public class IfElse_statement 
{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=a.nextInt();	
		if(mark>=85 && mark<=100)
		{
			System.out.println("Grade is A");
		}
		else if(mark>=60 && mark<=100)
		{
			System.out.println("Grade is B");
		}
		else if(mark>=45 && mark<=100)
		{
			System.out.println("Grade is C ");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
