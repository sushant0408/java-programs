class Factorial
{
	void calc()
	{        int a=4;
		int i;int fact=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 4 is :"+fact);
}
}
class Demo
{
	public static void main(String args[])
	{
		Factorial f1=new Factorial();
		f1.calc();
}
}


