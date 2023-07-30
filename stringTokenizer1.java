package com.example.Tamil;

import java.util.StringTokenizer;

public class stringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("I am a student of SRIET");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());

		}

	}

}
