// Check if a string is palindrome

import java.util.Scanner;

public class Q03_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) 
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
    }
}
