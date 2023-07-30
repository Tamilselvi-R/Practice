package com.example.Tamil;

public class OuterClass

{
	void my_method() 
	{
		int num =14;
		class methodInner
		{
			public void print()
			{
			System.out.println("This is method");
			}
		}
	    methodInner in=new methodInner();
	             in.print();
	 }
	          
	 public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.my_method();

	}
	 

}
