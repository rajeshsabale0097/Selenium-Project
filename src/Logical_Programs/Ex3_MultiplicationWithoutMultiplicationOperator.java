package Logical_Programs;

import org.testng.annotations.Test;

public class Ex3_MultiplicationWithoutMultiplicationOperator
{
	public static void main(String[] args)
	{
		int num1=40;
		int num2=2;
		
		int sum=0;
		for(int i=1;i<=num2;i++)//1<=2,2<=2,3<=2
		{
			sum=sum+num1;		//40,80
		}
		System.out.println(sum);
		
	}

}
