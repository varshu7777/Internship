import java.util.*;
public class DistinctCharacters 
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String input = sc.nextLine();
        	Set<Character> distinctChars = new LinkedHashSet<>();
        	for (char ch : input.toCharArray()) 
		{
            	distinctChars.add(ch);
        }
        System.out.println("Distinct characters in the string:");
        for (char ch : distinctChars) 
	{
            System.out.print(ch + " ");
        }
    }
}