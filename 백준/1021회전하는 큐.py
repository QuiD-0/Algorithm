from collections import deque
def turn(a):
    global q
    while(True):
        if a==q[0]:
            q.popleft()
            break
        else:
            q.append(q.popleft())
def findmin(a):
    pointer1=0
    pointer2=0
    while(True):
        if q[pointer1]==a:
            break
        else:pointer1+=1
    while(True):
        if q[pointer2]==a:
            break
        else:pointer2-=1
    return min(pointer1,abs(pointer2))

x=list(map(int,input().split()))
q=deque()
for i in range(x[0]):
    q.append(i+1)
li=list(map(int,input().split()))
res=0
for i in li:
    res+=findmin(i)
    turn(i)
print(res)
