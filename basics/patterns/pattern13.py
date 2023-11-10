# 1
# 2  3
# 4  5  6
# 7  8  9  10
# 11  12  13  14  15
# 16  17  18  19  20  21

def nNumberTriangle(n: int) -> None:
    # Write your solution here.
    counter = 1

    for i in range(n):
        for j in range(i+1):
            print(counter, end=" ")
            counter += 1

        print()


if __name__ == "__main__":
    nNumberTriangle(5)
