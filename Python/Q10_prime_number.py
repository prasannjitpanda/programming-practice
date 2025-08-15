import math

n = int(input("Enter a number: "))

if n <= 1:
    print(f"{n} is not a prime number.")
elif n == 2:
    print("2 is a prime number.")
elif n % 2 == 0:
    print(f"{n} is not a prime number.")
else:
    is_prime = True
    limit = math.isqrt(n)  # floor(sqrt(n))
    for i in range(3, limit + 1, 2):  # check only odd divisors
        if n % i == 0:
            is_prime = False
            break
    if is_prime:
        print(f"{n} is a prime number.")
    else:
        print(f"{n} is not a prime number.")
