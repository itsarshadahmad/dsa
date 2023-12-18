# Sum of all divisors
# https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720


def sumOfAllDivisors(n: int) -> int:
    # Write your code here
    sum_of_divisors = 0
    while n > 0:
        sum_of_divisors += sum_of_divisor(n)
        n -= 1

    return sum_of_divisors

# Brute Force solution
# def sum_of_divisor(n: int) -> int:
#     sum_of_divisor = 0
#     for i in range(1, n+1):
#         if n % i == 0:
#             sum_of_divisor += i

#     return sum_of_divisor


# Optimized Solution
def sum_of_divisor(n: int) -> int:
    sum = 0
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            sum += i
            if (n/i) != i:
                sum += int(n/i)
    return sum


n = 12

print(sumOfAllDivisors(n))
