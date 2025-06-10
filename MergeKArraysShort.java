import java.util.*;
public class MergeKArraysShort 
{
    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter number of arrays (K): ");
        	int k = sc.nextInt();
        	PriorityQueue<Integer> pq = new PriorityQueue<>();
        	for (int i = 0; i < k; i++)
		{
            		System.out.print("Enter size of array " + (i + 1) + ": ");
            		int n = sc.nextInt();
            		System.out.println("Enter " + n + " sorted elements:");
            		for (int j = 0; j < n; j++)
                	pq.add(sc.nextInt());
       	 	}
        	System.out.print("Merged Array: ");
        	while (!pq.isEmpty())
            	System.out.print(pq.poll() + " ");
    	}
}