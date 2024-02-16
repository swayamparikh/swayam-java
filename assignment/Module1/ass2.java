package com.ass;

import java.util.Scanner;

public class ass2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:- ");
		String ch=sc.next();
		if(ch.length()>1)
		{
			System.out.println("Invalid Input");
		}
		else if(ch.equals("A")||ch.equals("E")||ch.equals("I")||ch.equals("O")||ch.equals("U")||ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")) 
		{
			System.out.println("IT IS A VOWEL");
			
		}
		else
		{
			System.out.println("Connsonent");
		}
	}
}
