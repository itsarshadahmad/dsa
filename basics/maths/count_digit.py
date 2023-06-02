# Count Digits:
# https://practice.geeksforgeeks.org/problems/count-digits5716/1


class Solution:
    def evenlyDivides(self, N: int) -> int:
        # code here
        count = 0
        str_num = str(N)

        for s in str_num:
            i = int(s)
            if i != 0 and N % i == 0:
                count += 1

        return count


if __name__ == "__main__":
    sol = Solution()
    print(sol.evenlyDivides(12))
