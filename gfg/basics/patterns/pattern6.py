"""
Pattern 6:
https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
"""


def printTriangle(N):
    for i in range(N, 0, -1):
        for j in range(1, i+1):
            print("{}".format(j), end=" ")
        print()


if __name__ == "__main__":
    printTriangle(5)
