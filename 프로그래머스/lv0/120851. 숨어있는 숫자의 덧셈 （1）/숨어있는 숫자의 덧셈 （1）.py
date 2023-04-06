import re


def solution(my_string):
    sum = list(re.sub(r'[^0-9]', '', my_string))
    answer = 0
    for i in sum:
        answer += int(i)
    return answer