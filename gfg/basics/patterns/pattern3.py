# Pattern 3:
# https://practice.geeksforgeeks.org/problems/triangle-number/1

# 1
# 1 2
# 1 2 3
# 1 2 3 4
# 1 2 3 4 5

def printTriangle(N):
    for i in range(N):
        for j in range(i+1):
            print(f"{j+1}", end=" ")
        print()


if __name__ == "__main__":
    printTriangle(5)
