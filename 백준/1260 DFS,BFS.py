from collections import defaultdict,deque

def dfs(start):
    visit=[]
    stack=[]
    stack.append(start)
    while stack:
        node=stack.pop()
        if str(node) not in visit:
            stack.extend(sorted(graph[node],reverse=True))
            visit.append(str(node))
    return visit


def bfs(start):
    q=deque()
    visit=[]
    q.append(start)
    while q:
        node=q.popleft()
        if str(node) not in visit:
            q.extend(sorted(graph[node]))
            visit.append(str(node))
    return visit

n,m,v= map(int,input().split())
graph=defaultdict(list)
for _ in range(m):
    x,y=map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)
print((' ').join(dfs(v)))
