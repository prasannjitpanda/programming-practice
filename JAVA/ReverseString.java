//Reverse a string(without built-in functions)

import java.util.Scanner;

public class  ReverseString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[]arr=str.toCharArray();
        String rev="";

        for(int i=arr.length-1;i>=0;i--) {
            rev +=arr[i];
        }
        System.out.println("Reversed String="+rev);
    }
}