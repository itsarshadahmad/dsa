# A
# B B
# C C C
# D D D D

def alphaRamp(n: int) -> None:
    # Write your solution from here.
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + i), end=" ")
        print()


if __name__ == "__main__":
    alphaRamp(5)
