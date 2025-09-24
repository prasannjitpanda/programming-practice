n = int(input("Enter the number of terms: "))

a, b = 0, 1

if n <= 0:
    print("Please enter a positive integer.")
else:
    print("Fibonacci Series:")
    for _ in range(n):
        print(a, end=" ")
<<<<<<< HEAD
        a, b = b, a + b
=======
        a, b = b, a + b
>>>>>>> 979e5ee62829dbf3ff194fc2b66a49b69b63c86c
