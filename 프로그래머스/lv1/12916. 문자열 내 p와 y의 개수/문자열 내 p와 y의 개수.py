def solution(s):
    num1 = s.count("p");
    num2 = s.count("P");
    num3 = s.count("y");
    num4 = s.count("Y");
    if (num1 + num2) == (num3 + num4):
        return True
    else:
        return False