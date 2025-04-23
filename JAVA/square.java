//WAP to perform square of a given number?
import java.util.*;
class square {
    public static void main(String[] args) {
        //asking inputs
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int a=sc.nextInt();

        //logic
        int square=a*a;

        System.out.println("Square of a given number is ="+square);
    }
}