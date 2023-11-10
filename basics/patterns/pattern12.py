def numberCrown(n: int) -> None:
    # Write your solution here.
    for i in range(n):
        for j in range(i+1):
            print(j+1, end=" ")
        for j in range((n*2)-(i*2)):
            print(end=" ")
        for j in range(i+1, 0, -1):
            print(j, end=" ")
        print()


if __name__ == "__main__":
    numberCrown(5)
