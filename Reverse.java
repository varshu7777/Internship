import java.util.*;
class Reverse 
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
        String str = sc.next(); 
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) 
	{
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse string: " + rev);
    }
}
