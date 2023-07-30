package com.example.Tamil;

import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char A=sc.next().charAt(0);
		int b=sc.nextInt();
		char B=sc.next().charAt(0);
		int c=sc.nextInt();
		char C=sc.next().charAt(0);
		if(((a==b)&&(b==c))&&((A==B)&&(B==C))) {
			System.out.println("Double bonan za");
		}
		else if(((a==b)&&(b==c))||((A==B)&&(B==C))) {
			System.out.println("Bonanza");
		}
		else
		{
			System.out.println("No bonanza");
		}
		
		
	
		

	}

}
