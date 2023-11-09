# 1
# 0 1
# 1 0 1
# 0 1 0 1
# 1 0 1 0 1
# 0 1 0 1 0 1

if __name__ == "__main__":
    n = 4
    isZero = False

    for i in range(n):
        if i % 2 == 0:
            isZero = False
        else:
            isZero = True
        for j in range(i+1):
            if isZero:
                print("0", end=" ")
                isZero = False
            else:
                print("1", end=" ")
                isZero = True
        print()

    # Other way
    start = 1
    for i in range(n):
        if i % 2 == 0:
            start = 1
        else:
            start = 0

        for j in range(i+1):
            print(start, end=" ")
            start = 1 - start
        print()
