package com.example.Tamil;
class Outer_class
{
	 static class Inner_class
	{
		public String Print() 
		{
			return "Good morning";
		}
	}
}

public class Static_Inner_Class 
{
	public static void main(String[] args) 
	{
		Outer_class.Inner_class d=new Outer_class.Inner_class();
		System.out.print(d.Print());		
		

	}

}
