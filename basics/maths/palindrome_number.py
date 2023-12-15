n = 1214

def check_palindrome(num):
    rev_str_num = ""
    rev_str = reversed(str(num))
    for i in rev_str:
        rev_str_num += i
    return True if num == int(rev_str_num) else False

print(check_palindrome(n))
