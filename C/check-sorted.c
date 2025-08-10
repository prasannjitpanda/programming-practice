#include<stdio.h>
int main() {
    int n, sorted=1;
    printf("Enter no. of elements: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter number of elements: ");
    for(int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }
    for(int i=0; i<n-1; i++) {
        if(arr[i]>arr[i+1]) {
            sorted=0;
            break;
        }
    }
    if(sorted)
    printf("Array is sorted.\n");
    else
    printf("Array is NOT sorted.\n");
    return 0;
}