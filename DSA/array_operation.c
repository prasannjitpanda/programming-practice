//Array Insertion and Deletion
#include<stdio.h>
#include<stdlib.h>
#define MAX 100
int arr[MAX], n = 0;
void insert(int pos, int val) {
    if (n >= MAX) {
        printf("Array is full\n");
        return;
    }
    if (pos < 0 || pos > n) {
        printf("Invalid position\n");
        return;
    }
    for (int i = n; i > pos; i--) {
        arr[i] = arr[i - 1];
    }
    arr[pos] = val;
    n++;
}
void delete(int pos) {
    if (n <= 0) {
        printf("Array is empty\n");
        return;
    }
    if (pos < 0 || pos >= n) {
        printf("Invalid position\n");
        return;
    }
    for (int i = pos; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    n--;
}
void display() {
    if (n == 0) {
        printf("Array is empty\n");
        return;
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main() {
    int choice, pos, val;
    while (1) {
        printf("1. Insert\n2. Delete\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter position and value to insert: ");
                scanf("%d %d", &pos, &val);
                insert(pos, val);
                break;
            case 2:
                printf("Enter position to delete: ");
                scanf("%d", &pos);
                delete(pos);
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}