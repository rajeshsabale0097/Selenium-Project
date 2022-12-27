package MethodWithReturnTypes;


public class example1
{
	public static void main(String[] args)
	{
		int num1=addition(10,20);
		System.out.println(num1);
		
		int num2=addition(5,6);
		System.out.println(num2);
		
		System.out.println("----------");
		
		System.out.println(addition(100,200));
		
		System.out.println(addition(8,9));
		
		
	}
	
	public static int addition(int a,int b)
	
	{
		int sum=a+b;
		
		return sum;
		
	}

}
