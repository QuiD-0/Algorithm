from collections import deque
n=int(input())
a=deque(zip(map(int,input().split()),[i for i in range(1,n+1)]))
ans=[]
while a:
    (move,index)=a.popleft()
    ans.append(str(index))
    if len(a):
        if move>0:
            move-=1
            for _ in range(move):
                a.append(a.popleft())
        else:
            for _ in range(abs(move)):
                a.appendleft(a.pop())
print(' '.join(ans))
