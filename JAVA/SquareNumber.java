import java.util.*;
class SquareNumber {
    public static void main(String[] args) {

        //asking user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        //logic to calculate square
        int square = a * a;
        System.out.println("The square of a given number is= "+square);
        sc.close();
    }   
}