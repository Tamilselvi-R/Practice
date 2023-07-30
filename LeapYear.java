package com.example.Tamil;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner year=new Scanner(System.in);
		int a=year.nextInt();
		if(a>0) {
		if(a%4==0)
		{
			System.out.println("The given year is Leap year");
		}
		}
		if(a%4!=0)
		{
			System.out.println("The given is not an Leap year");
		}

	}

}
