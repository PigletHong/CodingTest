def solution(s):

    s = s.lower()
    substring1 = "p"
    substring2 = "y"

    x = s.count(substring1)
    y = s.count(substring2)

    return (x == y)