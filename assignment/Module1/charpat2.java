package com.ass;

public class charpat2
{
	public static void main(String[] args) 
	{
		int i,j;
		int rows=5;
		
		char character='a';
		for(i=0;i<rows;i++)
	   {
		for(j=0;j<i;j++)
		{
			System.out.print(" ");
		}
		System.out.println(j+" ");
	   }
	}
}
