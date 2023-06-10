"""
Pattern 5:
https://practice.geeksforgeeks.org/problems/triangle-pattern/1

* * * * *
* * * *
* * *
* *
*
"""


def printTriangle(N):
    for i in range(N, 0, -1):
        for j in range(i):
            print("*", end=" ")
        print()


if __name__ == "__main__":
    printTriangle(5)
