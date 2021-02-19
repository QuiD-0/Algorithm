from collections import defaultdict
v,e=map(int,input().split())
graph=defaultdict(list)
indegree=[0]*(v+1)
for _ in range(e):
    a,b=map(int,input().split())
    graph[a].append(b)
    indegree[b]+=1

from collections import deque
d=deque()
result=[]

for i in range(1,v+1):
    if indegree[i]==0:
        d.append(i)
while(d):
    node=d.popleft()
    result.append(node)
    next=graph[node]
    for i in next:
        indegree[i]-=1
        if indegree[i]==0:
            d.append(i)
           
print(result)


'''
입력
7 8
1 2
1 5
2 3
2 6
3 4
4 7
5 6
6 4
'''