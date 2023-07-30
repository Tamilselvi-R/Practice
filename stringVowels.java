package com.example.Tamil;
import java.util.Scanner;
public class stringVowels 
{
	static boolean isVowel(char c) {
		return (c==('a')||c==('i')||c==('e')||c==('o')||c==('u')); 
				}
	static void removevowels(StringBuffer s) {
		System.out.println(s);
		for(int i=0;i<s.length()-1;i++) {
			if(isVowel(s.charAt(i)))
				if(isVowel(s.charAt(i+1))) {
					s.delete(i+1, i+2);
				}
		}}
	public static void main(String[]args) 
	{
		System.out.print("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		StringBuffer s=new StringBuffer(a);
		removevowels(s);
		System.out.print(s);

}
}
