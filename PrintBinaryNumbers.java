import java.util.Scanner;
public class PrintBinaryNumbers 
{
    	public static void main(String[] args)
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter N: ");
        	int N = scanner.nextInt();
       	 	for (int i = 1; i <= N; i++) {
            	System.out.println(Integer.toBinaryString(i));
        }
    }
}