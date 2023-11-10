def nLetterTriangle(n: int) -> None:
    # Write your solution here.
    import string

    for i in range(n):
        for j in range(i+1):
            print(string.ascii_uppercase[j], end=" ")
        print()

    # Alternative way
    # Uppercase ascii value between 'A' to 'Z' is 65 to 90.
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + j), end=" ")

        print()


if __name__ == "__main__":
    nLetterTriangle(5)
