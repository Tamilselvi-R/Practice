package com.example.Tamil;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner a=new Scanner(System.in);
		int[] arr;
		int b=a.nextInt();
		arr= new int[b];
		for(int i=0;i<b;i++) 
		{
			System.out.print("Enter the Element "+(i+1)+" : ");//this line is for making an program interactive
			arr[i]=a.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Element "+(i+1)+" : "+arr[i]);
		}
	}

}
