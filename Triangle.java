import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of Triangle");
		int a=sc.nextInt();
		int d=sc.nextInt();
		int c=sc.nextInt();
		int pr=a+d+c;
		System.out.println("Enter length and breadth of triangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		double ar=0.5*l*b;
		System.out.println("Area="+ ar);
		System.out.println("Perimeter="+ pr);
	}
}
