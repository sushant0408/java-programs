import java.util.*;

class power
{
	void pow(int x,int y)
	{       int p=1;
		for(int i=1;i<=y;i++)
		{
			p=p*x;
		}
		System.out.println("x^y :"+p);
	}
}
class power1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x :");		
		int x=sc.nextInt();
		System.out.println("Enter y:");
		int y=sc.nextInt();
		power f1=new power();
		f1.pow(x,y
);
	}
}




