"""
    Pattern 7:
    https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1

        *
       ***
      *****
     *******
    *********
"""


def printTriangle(n):
    for i in range(n):
        for j in range(n-i-1):
            print(end=" ")

        for j in range(2*i+1):
            print("*", end="")

        for j in range(n-i-1):
            print(end=" ")

        print()


if __name__ == "__main__":
    printTriangle(5)
