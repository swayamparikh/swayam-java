package com.ass;

import java.util.Scanner;

public class ass3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year:- ");
		int a=sc.nextInt();
		
		
		if(a%4==0)
		{
			System.out.println("It is a leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	
		
	
	
	}
}
