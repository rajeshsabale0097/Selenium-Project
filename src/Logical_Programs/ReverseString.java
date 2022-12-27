package Logical_Programs;

public class ReverseString
{
	public static void main(String[] args) throws InterruptedException
	{
		String org="RAJESH";
				String rev="";
				
			for(int i=org.length()-1;i>=0;i--)
				{
					rev=rev+org.charAt(i);
				Thread.sleep(1000);                //H
				System.out.println(rev);           //HS
				}
			System.out.println(rev);

	}

}
