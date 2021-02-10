from collections import defaultdict
import heapq
n,m=map(int,input().split())
graph=defaultdict(list)
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
dist=[10000]*(1+n)
queue=[]
visit=[]
heapq.heappush(queue,(0,1))
while queue:
    cost,node=heapq.heappop(queue)
    visit.append(node)
    dist[node]=min(dist[node],cost)
    for i in list(graph[node]):
        if i not in visit:
            heapq.heappush(queue,(cost+1,i))
print(dist)
count=0
ans=0
for k in dist:
    if k != 10000:
        ans=max(ans,k)
i=dist.index(ans)
for k in dist:
    if k==ans:
        count+=1
print(i,dist[i],count)