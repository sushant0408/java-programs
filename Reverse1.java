import java.util.*;
class Reverse
{
	void Rev()
	{       Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");		
		int a=sc.nextInt();
		int i;int rever=0;int mod;
		while(a!=0)
		{
			mod=a%10;
			rever=rever*10+mod;
			a=a/10;
		}
		System.out.println("Reverse is :"+rever);
	}
}
class Reverse1
{
	public static void main(String args[])
	{
		Reverse f1=new Reverse();
		f1.Rev();
	}
}


