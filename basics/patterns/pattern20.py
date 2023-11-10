# *         *
# * *     * *
# * * * * * *
# * *     * *
# *         *

def symmetry(n: int):
    # Upper half
    space = 2*n-2
    for i in range(n-1):
        for j in range(i+1):
            print("*", end=" ")

        for j in range(space):
            print(end="  ")

        for j in range(i+1):
            print("*", end=" ")

        space -= 2
        print()

    # Lower half
    space = 0
    for i in range(n):
        for j in range(n-i):
            print("*", end=" ")

        for j in range(space):
            print(end="  ")

        for j in range(n-i):
            print("*", end=" ")

        space += 2
        print()


if __name__ == "__main__":
    symmetry(3)
