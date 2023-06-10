# # Pattern 4:
# https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1

# 1
# 2 2
# 3 3 3
# 4 4 4 4
# 5 5 5 5 5

def printTriangle(N):
    for i in range(1, N+1):
        for _ in range(i):
            print("{}".format(i), end=" ")
        print()


if __name__ == "__main__":
    printTriangle(5)
