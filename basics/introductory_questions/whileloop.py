# While loop- printTable (GFG):
# https://practice.geeksforgeeks.org/problems/while-loop-printtable/1


class Solution:
    def printTable(self, n):
        multiplier = 10
        while (multiplier):
            # Code here
            print(n * multiplier, end=" ")
            multiplier -= 1
        print()
