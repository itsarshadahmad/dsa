# A B C D
# A B C
# A B
# A

def nLetterTriangle(n: int):
    # Write your solution here.
    for i in range(n, 0, -1):
        for j in range(i):
            print(chr(65 + j), end=" ")
        print()


if __name__ == "__main__":
    nLetterTriangle(5)
