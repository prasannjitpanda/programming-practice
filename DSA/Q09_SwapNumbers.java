//Swap two numbers without using 3rd variable

import java.util.Scanner;
public class Q09_SwapNumbers  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Before swap: a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: a="+a+",b=" +b);
    }
}