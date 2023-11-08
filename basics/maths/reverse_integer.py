# Reverse Integer
# https://leetcode.com/problems/reverse-integer/

import math


class Solution:
    # Leetcode best runtime solution
    def reverse(self, x: int) -> int:
        MIN = -2 ** 31
        MAX = 2 ** 31 - 1
        xStr = str(x) if x >= 0 else str(x)[1:]
        xRev = xStr[::-1] if x >= 0 else "-" + xStr[::-1]
        XRevInt = int(xRev)
        if XRevInt > MAX or XRevInt < MIN:
            return 0
        return XRevInt

    # Memory efficient solution
    # def reverse(self, x: int) -> int:
    #     posX = abs(x)
    #     res = 0
    #     while posX > 0:
    #         res = res * 10 + posX % 10
    #         posX //= 10
    #     if res > 2 ** 31 - 1: return 0
    #     return res if x >= 0 else -res

    # Internet explained solution
    # def reverse(self, x: int) -> int:
    #     MIN = -2 ** 31
    #     MAX = 2 ** 31 - 1
    #     res = 0

    #     while x:
    #         digit = int(math.fmod(x, 10))
    #         x = int(x/10)

    #         if (res > MAX // 10 or (res == MAX // 10 and digit >= MAX % 10)):
    #             return 0
    #         if (res < MIN // 10 or (res == MIN // 10 and digit <= MIN % 10)):
    #             return 0

    #         res = (res * 10) + digit

    #     return res

    # My Solution
    # def reverse(self, x: int) -> int:
    #     if -2 ** 31 <= x and x <= 2 ** 31 - 1:
    #         if x >= 0:
    #             reverse_num = str(x)[::-1]
    #             return int(reverse_num) if int(reverse_num) <= 2 ** 31 - 1 else 0
    #         else:
    #             reverse_num = str(abs(x))[::-1]
    #             return -int(reverse_num) if -int(reverse_num) >= -2 ** 31 else 0
    #     else:
    #         return 0


if __name__ == "__main__":
    sol = Solution()
    res = sol.reverse(1534236469)
    print(res)
