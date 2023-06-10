
# Pattern 1:
# https://practice.geeksforgeeks.org/problems/square-pattern/1
# 
# * * * * *
# * * * * *
# * * * * *
# * * * * *
# * * * * *

def printTriangle(N):
    for _ in range(N):
        for _ in range(N):
            print("*", end=" ")
        print("")


if __name__ == "__main__":
    printTriangle(5)
