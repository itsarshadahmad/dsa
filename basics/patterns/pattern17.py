#     A
#   A B A
# A B C B A

def alphaHill(n: int):
    # Write your solution from here.
    for i in range(n):
        for j in range(n-i-1):
            print(end=" ")

        break_point = (2*i+1)//2
        counter = 65
        for j in range(2*i+1):
            print(chr(counter), end=" ")
            counter = counter + 1 if j < break_point else counter - 1
            # if j < break_point:
            #     counter += 1
            # else:
            #     counter -= 1

        for j in range(n-i-1):
            print(end=" ")

        print()


if __name__ == "__main__":
    alphaHill(5)
