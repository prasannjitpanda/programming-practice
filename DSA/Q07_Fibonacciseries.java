import java.util.Scanner;
public class Q07_Fibonacciseries {
    static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n=sc.nextInt();

        int a=0,b=1;
        System.out.print("Fibonacci(Iteractive): ");
        for(int i=1; i<=n; i++) {
            System.out.print(a+" ");
            int next=a+b;
        }
        System.out.print("\nfibonacci(Recursive): ");
        for(int i=0; i<n; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}