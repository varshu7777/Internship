import java.util.*;
public class MergeSortedLists 
{
	public static int[] merge(int[] a, int[] b) 
	{
        	int n = a.length, m = b.length;
        	int[] result = new int[n + m];
        	int i = 0, j = 0, k = 0;
        	while (i < n && j < m) 
		{
            		if (a[i] <= b[j]) 
			{
                		result[k++] = a[i++];
            		} 
			else 
			{
                		result[k++] = b[j++];
            		}
        	}
        	while (i < n) 	
		{
            		result[k++] = a[i++];
        	}
        	while (j < m) 
		{
            		result[k++] = b[j++];
        	}
        	return result;
    	}
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter size of first sorted list: ");
        	int n = sc.nextInt();
        	int[] list1 = new int[n];
        	System.out.println("Enter elements of first sorted list (in order):");
        	for (int i = 0; i < n; i++) 
		{
            		list1[i] = sc.nextInt();
        	}
        	System.out.print("Enter size of second sorted list: ");
        	int m = sc.nextInt();
        	int[] list2 = new int[m];
        	System.out.println("Enter elements of second sorted list (in order):");
        	for (int i = 0; i < m; i++) 
		{
            		list2[i] = sc.nextInt();
        	}
        	int[] merged = merge(list1, list2);
       		System.out.println("Merged List: " + Arrays.toString(merged));
    	}
}