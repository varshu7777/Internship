import java.util.*;

class Pangramdy {
    static final int MAX_CHAR = 26;

    public static boolean checkPangram(String s) {
        boolean[] vis = new boolean[MAX_CHAR];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                vis[c - 'A'] = true;
            else if (c >= 'a' && c <= 'z')
                vis[c - 'a'] = true;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            if (!vis[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String s = sc.nextLine();
        if (checkPangram(s))
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}
