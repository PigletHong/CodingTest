def solution(n):
    cnt = 0
    one_cnt = bin_convert(n)
    while cnt < 1:
        if bin_convert(n + 1) == one_cnt:
            return n + 1
        n = n + 1



def bin_convert(n):
    num = bin(n)
    cnt = 0
    for i in num:
        if i == '1':
            cnt = cnt + 1
    return cnt