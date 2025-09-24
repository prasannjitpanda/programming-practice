// Check if a number is prime.
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<=1) isPrime= false;

        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("NOT Prime");
        }
    }
}    