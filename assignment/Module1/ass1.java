package com.ass;

import java.util.Scanner;

public class ass1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number A:- ");
		int a=sc.nextInt();
		System.out.println("Enter The Number B:- ");
		int b=sc.nextInt();
		System.out.println("Enter The Number C:- ");
		int c=sc.nextInt();
		
		
		if(a>=b && a>=c)
		{
			System.out.println("A is Max...");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B is Max...");
		}
		else
		{
			System.out.println("C is Max..");
		}
			
	}
}
