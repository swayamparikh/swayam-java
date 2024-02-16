package com.ass;

import java.util.Scanner;

public class ass4 
{
	public static void main(String[] args) 
	{
		int sum=0;
	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Numbers");
//		int a1=sc.nextInt();
//		int a2=sc.nextInt();
//		int a3=sc.nextInt();
//		int a4=sc.nextInt();
//		int a5=sc.nextInt();
//		
		for(int i=0;i<=5;i++)
			
		{
			System.out.println("Enter The Number:- "+i);
			int no=sc.nextInt();
			sum=sum+no;
		//	avg=sum/5;
			
		}
		
		System.out.println("Sum is "+sum);
		System.out.println("Sum is "+sum/5);
		
		
		
		
		}
}
