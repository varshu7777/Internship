import java.util.*;
public class SetUnionIntersection 
{
    	public static void main(String[] args)
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter number of elements in first set: ");
        	int n1 = scanner.nextInt();
        	Set<Integer> set1 = new HashSet<>();
        	System.out.println("Enter elements of first set:");
        	for (int i = 0; i < n1; i++) 
		{
            		set1.add(scanner.nextInt());
        	}
        	System.out.print("Enter number of elements in second set: ");
        	int n2 = scanner.nextInt();
        	Set<Integer> set2 = new HashSet<>();
        	System.out.println("Enter elements of second set:");
        	for (int i = 0; i < n2; i++)
		{
            		set2.add(scanner.nextInt());
        	}
        	Set<Integer> union = new HashSet<>(set1);
        	union.addAll(set2);
        	Set<Integer> intersection = new HashSet<>(set1);
        	intersection.retainAll(set2);
        	System.out.println("Union: " + union);
        	System.out.println("Intersection: " + intersection);
    	}
}