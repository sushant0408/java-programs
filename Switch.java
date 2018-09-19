import java.util.*;
class Operations
{
void factorial(int a)
{double fact=1;int i;
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Factorial of"+a+"is :"+fact);
}
void fibonacci(int b)
{int l=0;int m=1;int n;
System.out.println("0\n1\n");
for(int i=1;i<=b-2;i++)
{n=l+m;
l=m;m=n;
System.out.println(n+"\n");
}
}
void reverse(int c)
{
int mod;int rev=0;
while(c!=0)
{
mod=c%10;
rev=rev*10+mod;
c=c/10;
}
System.out.println("Reverse of"+c+"is :"+rev);
}
void testPalin(int d)
{
int check=d;
int mod;int rev=0;
while(d!=0)
{
mod=d%10;
rev=rev*10+mod;
d=d/10;
}
if(check==rev)
System.out.println(check+"is palindrome");
else
System.out.println(check+"is not a palindrome");
}
void testArmstrong(int e)
{
int arm=0;int mod;
int check=e;
while(e!=0)
{
mod=e%10;
arm=arm+mod*mod*mod;
e=e/10;
}
if(arm==check)
System.out.println(check+"is an armstrong no.");
else
System.out.println(check+"is not an armstrong no.");
}
void testPrime(int f)
{int ctr=0;
for(int i=1;i<=f;i++)
{
if(f%i==0)
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
class Switch
{
public static void main(String args[])
{
System.out.println("Enter fact for factorial\nfibo for fibonacci serie\nrev for reverse\npalin to test palindrome\narm for testing armstrong\nprm to test prime");
Scanner sc=new Scanner(System.in);
String ch=sc.next();
System.out.println("Enter the no.");
int no=sc.nextInt();
Operations o1=new Operations();
switch(ch)
{
case "fact":
o1.factorial(no);
break;
case "fibo" :
o1.fibonacci(no);
break;
case "rev":
o1.reverse(no);
break;
case "palin":
o1.testPalin(no);
break;
case "arm":
o1.testArmstrong(no);
break;
case "prm":
o1.testPrime(no);
break;
default:
System.out.println("Invalid choice");
break;
}
}
}
























