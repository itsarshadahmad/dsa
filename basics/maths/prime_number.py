n = 5


def check_prime(n: int):
    is_prime = True
    if n == 1:
        is_prime = False
    else:
        # Value that are divisible by n are n/2.
        for i in range(2, int(n**0.5)+1): # n**0.5 will half value of n
            if n % i == 0:
                is_prime = False
                break

    print("YES") if is_prime else print("NO")


check_prime(n)
