# Pattern 2:
# https://practice.geeksforgeeks.org/problems/right-triangle/1
#
# *
# * *
# * * *
# * * * *
# * * * * *

def printTriangle(N):
    for i in range(N):
        for j in range(i+1):
            print("*", end=" ")
        print("")


if __name__ == "__main__":
    printTriangle(5)