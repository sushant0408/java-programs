import java.util.Scanner;
import java.util.*;
class OneDArray
{
	public static void main(String args[])
	{	
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];//initialisation of array
		int c=0;int d=0;int l=0;int m=0;
		System.out.println("Enter the elements");		
		for(i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		int x[]=new int[c];
		int y[]=new int[d];
		for(i=0;i<=n-1;i++)		
		{
			if(a[i]%2==0)
			{
		                x[l]=a[i];
				l++;
			}
			else
			{
				y[m]=a[i];
				m++;
			}
		}
		System.out.println("Even elements are:");
		for(i=0;i<=c-1;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("Odd elements are:");
		for(i=0;i<=d-1;i++)
		{
			System.out.print(y[i]+" ");
		}
	}
}

