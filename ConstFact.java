//program to find factorial using constructor
import java.util.Scanner;
import java.util.*;
class ConstFact
{
	int x;
	private ConstFact(int no)
	{
		x=no;
		
	}
	void Fact()
	{
		int i;
		int fact=1;
		for(i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);	
	}

	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");//taking input from user
	        n=sc.nextInt();
		ConstFact c=new ConstFact(n);//value passed to constructor
		Demo d=new Demo();	
		c1.Fact();
		
	}
}



 
		
