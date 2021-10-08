from collections import deque

def check(q):
    stack=[]
    for i in q:
        stack.append(i)
        if len(stack)>=2:
            if stack[-2]=="(" and stack[-1]==")" or stack[-2]=="{" and stack[-1]=="}" or stack[-2]=="[" and stack[-1]=="]":
                stack.pop()
                stack.pop()
    if len(stack)==0:
        return 1
    else:
        return 0
    
def solution(s):
    q=deque(s)
    answer = 0
    for _ in range(len(s)):
        answer+=check(q)
        q.append(q.popleft())
    return answer