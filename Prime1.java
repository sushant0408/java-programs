import java.util.*;
class Prime
{
	void prim()
	{       Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");		
		int a=sc.nextInt();
		int i;int ctr=0;
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				ctr++;
			}
		}
		if(ctr==2)
		{
			System.out.println("It is a prime no.");
		}
		else
		{
			System.out.println("Not a prime no.");
		}
}
}
class Prime1
{
	public static void main(String args[])
	{Prime p1=new Prime();
	p1.prim();
}
}

		
