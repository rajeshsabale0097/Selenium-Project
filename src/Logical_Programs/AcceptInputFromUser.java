package Logical_Programs;

import java.util.Scanner;

public class AcceptInputFromUser 
{
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter Num1:");
		int Num1 = s1.nextInt();               // use to accept int input from user
		
		System.out.print("Enter Num2:");
		int Num2=s1.nextInt();
		
		System.out.println(Num1+Num2);
		
		System.out.println("Enter Student Name:");
		String SN = s1.next();
		System.out.println(SN.length());
		
		
		
		
		
		
	}	
	

}
