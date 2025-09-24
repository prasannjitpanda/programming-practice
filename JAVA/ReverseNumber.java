import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), rev=0;
        while(n!=0) {
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println("Reversed= "+rev);
    }
}