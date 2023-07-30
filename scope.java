package com.example.Tamil;
class outer_Demo
{
	int num=10;
	public void print() 
	{	
		System.out.println("This is a Inner class ");
	}
	}
public class scope {
	public static void main(String[] args) 
	{outer_Demo d=new outer_Demo();
		d.print();

	}

}


