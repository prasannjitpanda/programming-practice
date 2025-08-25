import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(), count=0;

        while(n!=0) {
            count++;
            n/=10;
        }
        System.out.println("Number off Digits= " +count);
    }
}