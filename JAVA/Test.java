//WAP a java program to perform sum of two numbers without using third variable?
import java.util.*;
class Test
{
    public static void main(String[] args) {
        //asking inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();

        System.out.println("Enter the second number: ");
        int b=sc.nextInt();

        //logic
        int c=a+b;
        System.out.println("Sum of two numbers is="+c);
        
    }
}