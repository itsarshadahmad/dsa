# Armstrong Number
# https://www.codingninjas.com/studio/problems/check-armstrong_589

# n = 1235
# check length of n (that is 4 in this case), then square each number with 4.
# 1^4 + 2^4 + 3^4 + 5^4 = 1235
# If calculation is same then number is said to be armstrong number.

n = 153


def check_armstrong(n: int):
    total_sum = 0
    init_val = n
    size = len(str(n))
    while n > 0:
        total_sum = total_sum + ((n % 10) ** size)
        n = int(n / 10)

    if init_val == total_sum:
        print("true")
    else:
        print("false")


check_armstrong(n)


# rev = 0
# while n > 0:
#     rev = (rev * 10) + n % 10
#     n = int(n / 10)

# print(rev)
