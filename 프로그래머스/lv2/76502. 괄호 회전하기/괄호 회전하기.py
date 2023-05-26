def solution(s):
    from collections import deque
    s = deque(s)
    answer = 0
    for i in range(len(s)):
        s.rotate(-1)
        stack = []
        for ch in s:
            if ch == '(' or ch == '{' or ch == '[':
                stack.append(ch)
            else:
                if not stack:
                    break
                rear = stack.pop()
                if ch == ')' and rear != '(':
                    break
                elif ch == '}' and rear != '{':
                    break
                elif ch == ']' and rear != '[':
                    break
        else:
            if len(stack) == 0:
                answer += 1
    return answer