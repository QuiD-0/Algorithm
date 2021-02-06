import heapq
from collections import defaultdict as d

n,m,c = map(int,input().split())
graph=d(list)
q=[]
dis=[10000]*(n+1)
for _ in range(m):
    x,y,z=map(int,input().split())
    graph[x].append((y,z))

heapq.heappush(q,[0,c])
dis[c]=0
while q:
    dist,now = heapq.heappop(q)
    for node in list(graph[now]):
        cost=dist+node[1]
        if cost < dis[node[0]]:
            dis[node[0]]=cost
            heapq.heappush(q,[cost,node[0]])
count=0
maxD=0
for i in dis[1:]:
    if i!=10000:
        count+=1
        maxD=max(maxD,i)
print(count-1,maxD)



    
    
