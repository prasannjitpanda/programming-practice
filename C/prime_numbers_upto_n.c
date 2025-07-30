#include<stdio.h>
int main() {
    int i, j, n, isPrime;

    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Prime numbers up to %d are: \n",n);

    for(i=2; i<=n; i++) {
        isPrime = 1; //Assume current number is prime

        for(j=2; j<=i/2; j++) {
            if(i%j==0) {
                isPrime = 0; //Not  a prime
                break;
            }
        }
        if(isPrime) {
            printf("%d ", i); //Print the prime number
        }
    }
    printf("\n");
    return 0;
}