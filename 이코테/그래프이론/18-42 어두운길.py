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
n,m=map(int,input().split())
q=[]
root=[i for i in range(n+1)]
total=0
for _ in range(m):
    a,b,c=map(int,input().split())
    total+=c
    heapq.heappush(q,(c,a,b))
min_cost=0
while q:
    cost,a,b=heapq.heappop(q)
    if find(a)!=find(b):
        min_cost+=cost
        union(a,b)

print(total-min_cost)