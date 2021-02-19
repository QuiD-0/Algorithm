from collections import defaultdict,deque
import copy
n=int(input())
graph=defaultdict(list)
indeg=[0]*(n+1)
need=[0]*(n+1)
for i in range(1,1+n):
    a=[j for j in list(map(int,input().split())) if j !=-1]
    need[i]=a[0]
    if len(a)!=1:
        for k in a[1:]:
            indeg[i]+=1
            graph[k].append(i)

q=deque()
result = copy.deepcopy(need)
for i in range(1,1+n):
    if indeg[i]==0:
        q.append(i)
while q:
    node=q.popleft()
    for i in list(graph[node]):
        indeg[i]-=1
        result[i] = result[node] + need[i]
        if indeg[i]==0:
            q.append(i)
print(result[1:])