def solution(s, n):
    sum = []
    fin = []
    for i in s:
        sum.append(ord(i))
    for i in sum:
        if 90 < i + n < 116 and i < 91:
            i = i + n - 26
            fin.append(chr(i))
        elif i + n > 122:
            i = i + n -26
            fin.append(chr(i))
        elif i == 32:
            i = 32
            fin.append(chr(i))
        else:
            fin.append(chr(i+n))
    return "".join(fin)