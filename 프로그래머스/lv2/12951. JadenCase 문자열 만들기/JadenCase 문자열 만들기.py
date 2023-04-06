def solution(s):
    sum = list(s.split(" "))
    sum2 = []
    sum3 = []
    answer =""
    for i in sum:
        sum2.append(i.lower())
    for i in sum2:
        sum3.append(i.capitalize())
    for i in sum3:
        answer = answer + i + " "
    answer = answer[:-1]
    return answer

