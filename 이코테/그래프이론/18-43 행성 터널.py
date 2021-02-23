def find(a):
    if root[a]!=a:
        root[a]=find(root[a])
    return root[a]

def union(a,b):
    a=find(a)
    b=find(b)
    if a>b:
        root[a]=b
    else:
        root[b]=a

import heapq
n=int(input())
root=[i for i in range(n+1)]
q=[]
x=[]
y=[]
z=[]
for i in range(1, n + 1):
    data = list(map(int, input().split()))
    x.append((data[0], i))
    y.append((data[1], i))
    z.append((data[2], i))
x.sort()
y.sort()
z.sort()
for i in range(n - 1):
    heapq.heappush(q,(x[i + 1][0] - x[i][0], x[i][1], x[i + 1][1]))
    heapq.heappush(q,(y[i + 1][0] - y[i][0], y[i][1], y[i + 1][1]))
    heapq.heappush(q,(z[i + 1][0] - z[i][0], z[i][1], z[i + 1][1]))

result=0
while q:
    cost,x,y= heapq.heappop(q)
    if find(x)!=find(y):
        union(x,y)
        result+=cost

print(result)
