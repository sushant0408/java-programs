import java.util.*;
class TwoDArray
{
public static void main(String args[]);
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for Addition\nEnter 2 for Subtracation\nEnter 3 for Multiplication\nEnter 4 for Transpose");
int ch=sc.nextInt();
System.out.println("Enter the number:);
int n=sc.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
switch(ch)
{
case 1:
System.out.println("Enter 1st Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
System.out.println("Enter 2nd Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		b[i][j]=sc.nextInt();
	}
}
add(a[][],b[][]);
break;
case 2:
System.out.println("Enter 1st Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
System.out.println("Enter 2nd Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		b[i][j]=sc.nextInt();
	}
}
subt(a[][],b[][]);
break;
case 3:
System.out.println("Enter 1st Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
System.out.println("Enter 2nd Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		b[i][j]=sc.nextInt();
	}
}
mul(a[][],b[][]);
break;
case 4:
System.out.println("Enter Array: ");
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
trans(a[][]);
break;

