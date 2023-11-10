# C
# C B
# C B A

def alphaTriangle(n: int):
    # Write your solution here.
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + (n-j-1)), end=" ")

        print()
