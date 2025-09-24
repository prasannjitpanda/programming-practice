num = int(input("Enter a number: "))
factorial = 1
if num < 0:
    print("Factorial does not exist for negative numbers.")
<<<<<<< HEAD
elif num == 0:
    print("Factorial of 0 is 1.")
else:
    for i in range(1, num+1):
        factorial *= i
print(f"Factorial of {num} is {factorial}.")     
   
=======
elif num  == 0:
    print("Factorial of 0 is 1")
else:
    for i in range(1, num+1):
        factorial *=  i
        print(f"Factorial of {num} is {factorial}")
>>>>>>> 979e5ee62829dbf3ff194fc2b66a49b69b63c86c
