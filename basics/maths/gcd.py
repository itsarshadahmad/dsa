x, y = 24, 5

# Brute Force Solution
# def calc_gcd(x, y):
#     n = min(x, y)
#     gcd = 0
#     for i in range(1, n+1):
#         if x % i == 0 and y % i == 0:
#             gcd = i

#     return gcd


# Euclidean Algorithm
def calc_gcd(x, y):
    while x > 0 and y > 0:
        if x > y:
            x = x % y
        else:
            y = y % x
        if x == 0:
            return y
        else:
            return x


print(calc_gcd(x, y))
