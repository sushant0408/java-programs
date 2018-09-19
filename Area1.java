import java.util.Scanner;
import java.util.*;
class Metdovr
{
int area(int side)
{
int Squarearea=side*side;
return Squarearea;
}
double area(float radius)
{
double CircleArea=3.14*radius*radius;
return CircleArea;
}
int area(int l,int b)
{
int RectArea=l*b;
return RectArea;
}
}
class Area1
{
public static void main(String args[])
{
int ch,s,l,b,sarea,rarea,a;
float r;double x;
Scanner sc=new Scanner(System.in);
Metdovr m1=new Metdovr();
do
{
System.out.println("1.Area of Square\n2.Area of Circle\n3.Area of Rectangle\n4.Exit");
System.out.println("Enter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the lenght of side");
s=sc.nextInt();
sarea=m1.area(s);
System.out.println("Area of Square="+sarea);
break;
case 2:
System.out.println("Enter radius of Circle:");
r=sc.nextFloat();
x=m1.area(r);
System.out.println("Area of circle="+x);
break;
case 3:
System.out.println("Enter lenght:");
l=sc.nextInt();
System.out.println("Enter breadth");
b=sc.nextInt();
System.out.println("Area of the Rectangle is :"+m1.area(l,b));
break;
case 4:
break;
}
}while(ch!=4);
}
}



