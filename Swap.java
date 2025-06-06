import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
         	int b=sc.nextInt();
		System.out.println("Before Swap: "+"a="+ a +" b="+b);
		int temp=a;
     		a=b;
		b=temp;
  		System.out.println("After Swap: "+"a="+ a +" b="+b);
	}

}	