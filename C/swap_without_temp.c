#include<stdio.h>
int main() {
    int a,b;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    //Swapping without using a temporary variable
    a=a+b;
    b=a-b;
    a=a-b;

    printf("After swapping: a = %d, b = %d\n", a,b);
    return 0;
}