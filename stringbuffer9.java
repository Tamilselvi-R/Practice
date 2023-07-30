package com.example.Tamil;
public class stringbuffer9 
{
	public static void main(String[] args) 
	{
		StringBuffer a= new StringBuffer("Tamil");
		a.reverse();
		System.out.println(a);
		a.delete(1,3);
		System.out.println(a);	
		a.capacity();
		System.out.println(a.capacity());
	}
}
