#include<stdio.h>
int main() {
    int a,b,temp;

    printf("Enter Two Numbers: ");
    scanf("%d %d",&a,&b);

    //swapping using a third variable
    temp=a;
    a=b;
    b=temp;

    printf("After swapping: a=%d, b=%d\n", a,b);
    return 0;
}