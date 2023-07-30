package com.example.Tamil;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your Email ");
		String email;
		email=a.nextLine();
		System.out.print(email);
		if(email.contains("com")||email.contains("org")||email.contains("in")||email.contains("net")) {
			System.out.println(" is a Valid mail Id");
		}
		else
			System.out.println(" is a Invalid mail Id");

	}

}
