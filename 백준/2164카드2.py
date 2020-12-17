from collections import deque
a=deque()
x=int(input())
for i in range(1,1+x):
    a.append(i)
while(len(a)!=1):
    a.popleft()
    a.append(a.popleft())
print(a[0])
