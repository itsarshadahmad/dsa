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
